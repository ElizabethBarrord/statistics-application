package com.example.springboot.service;

import com.example.springboot.model.Season;
import com.example.springboot.repositories.StatisticsRepository;
import com.example.springboot.service.StatisticDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatisticService {

    private final StatisticDatabase statisticDatabase;
    private final StatisticsRepository seasonsRepository;

    @Autowired
    public StatisticService(StatisticsRepository seasonsRepository, StatisticDatabase statisticDatabase) {
        this.seasonsRepository = seasonsRepository;
        this.statisticDatabase = statisticDatabase;
    }
}