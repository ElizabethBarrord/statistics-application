package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.Season;

import java.util.List;

@Repository
public interface StatisticsRepositoryCustom {

    // calculate win percentage
    double calculateWinPercentage(Integer wins, Integer losses);

    // calculate yards per game
    double calculateYardsPerGame(Integer yardsFor, Integer games);

}