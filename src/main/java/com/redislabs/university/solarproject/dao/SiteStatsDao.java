package com.redislabs.university.solarproject.dao;

import com.redislabs.university.solarproject.api.MeterReading;
import com.redislabs.university.solarproject.api.SiteStats;

import java.time.ZonedDateTime;

public interface SiteStatsDao {
    SiteStats findById(long siteId);
    SiteStats findById(long siteId, ZonedDateTime day);
    void update(MeterReading reading);
}
