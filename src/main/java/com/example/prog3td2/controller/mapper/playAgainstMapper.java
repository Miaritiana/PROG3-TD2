package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.playagainstResponse.createPlayAgainstResponse;
import com.example.prog3td2.controller.response.playagainstResponse.playAgainstResponse;
import com.example.prog3td2.controller.response.teamResponse.createTeamResponse;
import com.example.prog3td2.controller.response.teamResponse.teamResponse;
import com.example.prog3td2.model.PlayAgainst;
import com.example.prog3td2.model.Team;
import org.springframework.stereotype.Component;

@Component
public class playAgainstMapper {
    public playAgainstResponse toRest(PlayAgainst domain) {
        return playAgainstResponse.builder()
                .id(domain.getId())
                .stadium(domain.getStadium())
                .datetime(domain.getDatetime())
                .host(domain.getHost())
                .opponents(domain.getOpponents())
                .build();
    }

    public PlayAgainst toDomain(createPlayAgainstResponse rest) {
        return PlayAgainst.builder()
                .stadium(rest.getStadium())
                .datetime(rest.getDatetime())
                .host(rest.getHost())
                .opponents(rest.getOpponents())
                .build();
    }

    public PlayAgainst toDomain(playAgainstResponse rest) {
        return PlayAgainst.builder()
                .id(rest.getId())
                .stadium(rest.getStadium())
                .datetime(rest.getDatetime())
                .host(rest.getHost())
                .opponents(rest.getOpponents())
                .build();
    }
}
