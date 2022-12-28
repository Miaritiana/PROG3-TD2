package com.example.prog3td2.service;

import com.example.prog3td2.model.Team;
import com.example.prog3td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<Team> getTeams(){
        return repository.findAll();
    }
    public List<Team> postTeams(List<Team> teams){
        return repository.saveAll(teams);
    }
    public List<Team> putTeams(List<Team> teams){
        return repository.saveAll(teams);
    }

    public void deleteTeam(int id){
        repository.deleteById(id);
    }

    public Optional<Team> findTeam(int id){
        return repository.findById(id);
    }
}
