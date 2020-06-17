package com.redislabs.university.solarproject.dao;

import com.redislabs.university.solarproject.api.GeoQuery;
import com.redislabs.university.solarproject.api.Site;

import java.util.Set;

public interface SiteGeoDao extends SiteDao {
    Set<Site> findByGeo(GeoQuery query);
}
