package com.redislabs.university.solarproject;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RediSolarConfiguration extends Configuration {

    private String defaultName = "Bob";
    private RedisConfig redisConfig;

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @JsonProperty("redis")
    public void setRedisConfig(RedisConfig config) {
        this.redisConfig = config;
    }

    @JsonProperty("redis")
    public RedisConfig getRedisConfig() {
        return redisConfig;
    }
}
