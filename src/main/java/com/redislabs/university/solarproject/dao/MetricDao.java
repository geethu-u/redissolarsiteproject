package com.redislabs.university.solarproject.dao;

import com.redislabs.university.solarproject.api.Measurement;
import com.redislabs.university.solarproject.api.MeterReading;
import com.redislabs.university.solarproject.api.MetricUnit;

import java.time.ZonedDateTime;
import java.util.List;

public interface MetricDao {
    void insert(MeterReading reading);
    List<Measurement> getRecent(Long siteId, MetricUnit unit,
                                ZonedDateTime time,Integer limit);
}
