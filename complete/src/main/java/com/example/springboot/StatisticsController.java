package com.example.springboot;

import com.example.springboot.model.Season;
import com.example.springboot.repositories.StatisticsRepository;
import com.example.springboot.repositories.StatisticsRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;


@RestController
public class StatisticsController {
    
        private final StatisticsRepository seasonsRepository;
        private final StatisticsRepositoryCustom seasonsRepositoryCustom;
        
    
        @Autowired
        public StatisticsController(StatisticsRepository seasonsRepository) {
            this.seasonsRepository = seasonsRepository;
        }
    
        // save season
        @PostMapping("/seasons")
        public ResponseEntity<Season> saveSeason(@RequestBody Season season) {
            return new ResponseEntity<>(seasonsRepository.save(season), HttpStatus.OK);
        }

        // delete season
        @PostMapping("/seasons/delete")
        public ResponseEntity<Season> deleteSeason(@RequestBody Season season) {
            seasonsRepository.delete(season);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        // get all seasons
        @GetMapping("/seasons")
        public ResponseEntity<Iterable<Season>> getSeasons() {
            return new ResponseEntity<>(seasonsRepository.findAll(), HttpStatus.OK);
        }

}


