package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "teams", schema = "STATISTICS_APP")
public class Team {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer teamID;
    private String teamName;
    private String teamCity;
    private String teamState;
    private String teamMascot;

    public Team() {
    }

    public Team(String teamName, String teamCity, String teamState, String teamMascot) {
        this.teamName = teamName;
        this.teamCity = teamCity;
        this.teamState = teamState;
        this.teamMascot = teamMascot;
    }

    public Integer getTeamID() {
        return this.teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return this.teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamState() {
        return this.teamState;
    }

    public void setTeamState(String teamState) {
        this.teamState = teamState;
    }

    public String getTeamMascot() {
        return this.teamMascot;
    }
    
    
}