CREATE DATABASE IF NOT EXISTS STATISTICS_APP;

USE STATISTICS_APP;

drop table if exists STATISTICS_APP.seasons;
drop table if exists STATISTICS_APP.teams;

CREATE TABLE STATISTICS_APP.teams (
    teamID SERIAL PRIMARY KEY,
    teamName VARCHAR(255),
    teamCity VARCHAR(255),
    teamState VARCHAR(255),
    teamMascot VARCHAR(255)
);

CREATE TABLE STATISTICS_APP.seasons (
    seasonID SERIAL PRIMARY KEY,
    seasonYear INT,
    wins INT,
    losses INT,
    yardsFor INT,
    yardsAgainst INT,
    fumbles INT,
    interceptions INT,
    FOREIGN KEY (teamID) REFERENCES STATISTICS_APP.teams(teamID)
);

insert into STATISTICS_APP.teams (teamName, teamCity, teamState, teamMascot) values ('Bears', 'Chicago', 'IL', 'Bruins');

insert into STATISTICS_APP.seasons (seasonYear, wins, losses, yardsFor, yardsAgainst, fumbles, interceptions, teamID) values (2019, 8, 8, 5000, 5000, 10, 10, 1);
insert into STATISTICS_APP.seasons (seasonYear, wins, losses, yardsFor, yardsAgainst, fumbles, interceptions, teamID) values (2018, 8, 8, 5000, 5000, 10, 10, 1);

