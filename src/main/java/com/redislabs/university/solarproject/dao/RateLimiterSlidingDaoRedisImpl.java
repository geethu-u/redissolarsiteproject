package com.redislabs.university.solarproject.dao;

import org.joda.time.DateTime;
import redis.clients.jedis.*;

import java.time.ZonedDateTime;

public class RateLimiterSlidingDaoRedisImpl implements RateLimiter {

    private final JedisPool jedisPool;
    private final long windowSizeMS;
    private final long maxHits;

    public RateLimiterSlidingDaoRedisImpl(JedisPool pool, long windowSizeMS,
                                          long maxHits) {
        this.jedisPool = pool;
        this.windowSizeMS = windowSizeMS;
        this.maxHits = maxHits;
    }

    // Challenge #7
    @Override
    public void hit(String name) throws RateLimitExceededException {
        // START CHALLENGE #7
        String key = getKey(name);
        try (Jedis jedis = jedisPool.getResource()) {
            Transaction t = jedis.multi();
            long currentTime = DateTime.now().getMillis();
            t.zadd(key, currentTime, getTimeStamp(currentTime ,name));
            long removeScore = currentTime - windowSizeMS;
            t.zremrangeByScore(key, Double.NEGATIVE_INFINITY, removeScore );
            Response<Long> numOfHits= t.zcard(key);
            t.exec();
            if(numOfHits.get()>maxHits){
                throw new RateLimitExceededException();
            }

        }



            // END CHALLENGE #7
    }
    private String getKey(String name) {
        return RedisSchema.getRateLimiterKeyForSlidingWindow(name, windowSizeMS, maxHits);
    }
    private String getTimeStamp(long ts, String name) {
        return String.valueOf(ts) + '-' + Math.random();
    }
}
