package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.teamResponse.createTeamResponse;
import com.example.prog3td2.controller.response.teamResponse.teamResponse;
import com.example.prog3td2.model.Team;
import org.springframework.stereotype.Component;

@Component
public class teamMapper {
    public teamResponse toRest(Team domain) {
        return teamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .players(domain.getPlayers())
                .sponsors(domain.getSponsors())
                .build();
    }

    public Team toDomain(createTeamResponse rest) {
        return Team.builder()
                .name(rest.getName())
                .players(rest.getPlayers())
                .sponsors(rest.getSponsors())
                .build();
    }

    public Team toDomain(teamResponse rest) {
        return Team.builder()
                .id(rest.getId())
                .name(rest.getName())
                .players(rest.getPlayers())
                .sponsors(rest.getSponsors())
                .build();
    }
}

