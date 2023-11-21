package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "seasons", schema = "STATISTICS_APP")
public class Season {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer seasonID;
    private Integer teamID;
    private Integer seasonYear;
    private Integer wins;
    private Integer losses;
    private Integer yardsFor;
    private Integer yardsAgainst;
    private Integer fumbles;
    private Integer interceptions;
    private Integer fumblesRecovered;
    private Integer interceptionsRecovered;
    
    

    public Season() {
    }

    public Season(Integer wins, Integer losses) {
        this.wins = wins;
        this.losses = losses;
    }

    public Integer getSeasonID() {
        return this.seasonID;
    }

    public void setSeasonID(Integer seasonID) {
        this.seasonID = seasonID;
    }

    public Integer getTeamID() {
        return this.teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public Integer getseasonYear() {
        return this.seasonYear;
    }

    public void setseasonYear(Integer seasonYear) {
        this.seasonYear = seasonYear;
    }

    public Integer getWins() {
        return this.wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return this.losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getYardsFor() {
        return this.yardsFor;
    }

    public void setYardsFor(Integer yardsFor) {
        this.yardsFor = yardsFor;
    }

    public Integer getYardsAgainst() {
        return this.yardsAgainst;
    }

    public void setYardsAgainst(Integer yardsAgainst) {
        this.yardsAgainst = yardsAgainst;
    }

    public Integer getFumbles() {
        return this.fumbles;
    }

    public void setFumbles(Integer fumbles) {
        this.fumbles = fumbles;
    }

    public Integer getInterceptions() {
        return this.interceptions;
    }

    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Integer getFumblesRecovered() {
        return this.fumblesRecovered;
    }

    public void setFumblesRecovered(Integer fumblesRecovered) {
        this.fumblesRecovered = fumblesRecovered;
    }

    public Integer getInterceptionsRecovered() {
        return this.interceptionsRecovered;
    }

    public void setInterceptionsRecovered(Integer interceptionsRecovered) {
        this.interceptionsRecovered = interceptionsRecovered;
    }
}

   