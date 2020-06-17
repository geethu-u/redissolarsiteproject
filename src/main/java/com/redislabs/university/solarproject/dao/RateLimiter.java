package com.redislabs.university.solarproject.dao;

public interface RateLimiter {
    void hit(String name) throws RateLimitExceededException;
}
