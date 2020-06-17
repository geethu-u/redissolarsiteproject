package com.redislabs.university.solarproject.dao;

import com.redislabs.university.solarproject.api.MeterReading;

import java.util.List;

public interface FeedDao {
    void insert(MeterReading meterReading);
    List<MeterReading> getRecentGlobal(int limit);
    List<MeterReading> getRecentForSite(long siteId, int limit);
}
