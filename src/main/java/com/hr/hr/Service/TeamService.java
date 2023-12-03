package com.hr.hr.Service;

import com.hr.hr.Entity.Team;

import java.util.List;

public interface TeamService {
    Team createTeam(Team team);
    Team updateTeam(Team team);
    Team getTeamById(Long teamId);
    List<Team> getAllTeams();
    void deleteTeam(Long teamId);
}
