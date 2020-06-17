package com.redislabs.university.solarproject.api;

import java.util.List;

public class CapacityReport {
    private List<SiteCapacityTuple> highestCapacity;
    private List<SiteCapacityTuple> lowestCapacity;

    public CapacityReport(List<SiteCapacityTuple> highest, List<SiteCapacityTuple> lowest) {
        this.highestCapacity = highest;
        this.lowestCapacity = lowest;
    }

    public List<SiteCapacityTuple> getHighestCapacity() {
        return highestCapacity;
    }

    public List<SiteCapacityTuple> getLowestCapacity() {
        return lowestCapacity;
    }
}
