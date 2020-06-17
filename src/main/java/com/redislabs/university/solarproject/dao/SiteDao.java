package com.redislabs.university.solarproject.dao;

import com.redislabs.university.solarproject.api.Site;

import java.util.Set;

public interface SiteDao {
    void insert(Site site);
    Site findById(long id);
    Set<Site> findAll();
}
