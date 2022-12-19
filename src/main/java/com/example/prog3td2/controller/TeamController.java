package com.example.prog3td2.controller;


import com.example.prog3td2.controller.mapper.teamMapper;
import com.example.prog3td2.controller.response.teamResponse.createTeamResponse;
import com.example.prog3td2.controller.response.teamResponse.teamResponse;
import com.example.prog3td2.model.Team;
import com.example.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final teamMapper mapper;

    @GetMapping("/Teams")
    public List<teamResponse> getTeam(){
        return service.getTeams().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/Teams")
    public List<teamResponse> postTeam(@RequestBody List<createTeamResponse> teams){
        List<Team> toCreate = teams.stream().map(mapper::toDomain).toList();
        return service.postTeams(toCreate).stream()
                .map(mapper::toRest)
                .toList();
    }
    @PutMapping("/Teams")
    public List<teamResponse> putTeam(@RequestBody List<teamResponse> toUpdate){
        List<Team> teams = toUpdate.stream().map(mapper::toDomain).toList();
        return service.putTeams(teams).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/Teams/{id}")
    public void deleteTeam(@PathVariable int id){
        service.deleteTeam(id);
    }
    @GetMapping("/Teams/{id}")
    public Optional<Team> findTeam(@PathVariable int id){
        return service.findTeam(id);
    }
}
