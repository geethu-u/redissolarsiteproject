package com.redislabs.university.solarproject.dao;

import com.redislabs.university.solarproject.api.CapacityReport;
import com.redislabs.university.solarproject.api.MeterReading;

public interface CapacityDao {
    void update(MeterReading reading);
    CapacityReport getReport(Integer limit);
    Long getRank(Long siteId);
}
