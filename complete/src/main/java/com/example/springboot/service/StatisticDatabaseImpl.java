package com.example.springboot.service;

import com.example.springboot.model.Season;
import com.example.springboot.repositories.StatisticsRepository;
import java.util.Collection;

public class StatisticDatabaseImpl implements StatisticDatabase {

    private StatisticsRepository seasonsRepository;

    public StatisticDatabaseImpl(StatisticsRepository seasonsRepository) {
        this.seasonsRepository = seasonsRepository;
    }

    @Override
    public void save(Season season) {
        seasonsRepository.save(season);
    }

    @Override
    public Collection<Season> getAllSeasons() {
        return seasonsRepository.findAll();
    }

    @Override
    public void deleteSeasonById(int id) {
        seasonsRepository.deleteById(id);
    }

}