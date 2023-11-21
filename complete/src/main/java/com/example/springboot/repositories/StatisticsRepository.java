package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.Season;

import java.util.List;

@Repository
public interface StatisticsRepository extends JpaRepository<Season, Integer> {
    // save season
    Season save(Season season);

    // delete season
    void delete(Season season);

    // get all seasons
    List<Season> findAll();
    
}