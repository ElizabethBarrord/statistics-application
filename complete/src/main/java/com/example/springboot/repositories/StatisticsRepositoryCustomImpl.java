package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.Season;
import com.example.springboot.repositories.StatisticsRepositoryCustom;

@Repository
public class StatisticsRepositoryCustomImpl implements StatisticsRepositoryCustom {

    // calculate win percentage
    public double calculateWinPercentage(Integer wins, Integer losses) {
        return (double) wins / (wins + losses);
    }

    // calculate yards per game
    public double calculateYardsPerGame(Integer yardsFor, Integer games) {
        return (double) yardsFor / games;
    }

}