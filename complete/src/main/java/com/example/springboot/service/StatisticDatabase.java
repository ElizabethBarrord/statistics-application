package com.example.springboot.service;

import com.example.springboot.model.Season;

import java.util.List;
import java.util.Collection;

public interface StatisticDatabase {
    // save season
    void save(Season season);

    // get all seasons
    Collection<Season> getAllSeasons();

    // delete season by id
    void deleteSeasonById(int id);

}