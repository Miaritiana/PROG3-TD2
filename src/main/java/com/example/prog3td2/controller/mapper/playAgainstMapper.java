package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.playagainstResponse.createPlayAgainstResponse;
import com.example.prog3td2.controller.response.playagainstResponse.playAgainstResponse;
import com.example.prog3td2.model.PlayAgainst;
import com.example.prog3td2.model.Team;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class playAgainstMapper {
    public playAgainstResponse toRest(PlayAgainst domain) {
        return playAgainstResponse.builder()
                .id(domain.getId())
                .datetime(domain.getDatetime())
                .home(domain.getHome())
                .guest(domain.getGuest())
                .build();
    }

    public PlayAgainst toDomain(createPlayAgainstResponse rest) {
        return PlayAgainst.builder()
                .stadium(rest.getStadium())
                .datetime(rest.getDatetime())
                .home(rest.getHome())
                .guest((List<Team>) rest.getGuest())
                .build();
    }

    public PlayAgainst toDomain(playAgainstResponse rest) {
        return PlayAgainst.builder()
                .id(rest.getId())
                .datetime(rest.getDatetime())
                .home(rest.getHome())
                .guest(rest.getGuest())
                .build();
    }
}
