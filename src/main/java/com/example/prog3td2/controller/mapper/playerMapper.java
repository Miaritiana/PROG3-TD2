package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.playerResponse.createPlayerResponse;
import com.example.prog3td2.controller.response.playerResponse.playerResponse;
import com.example.prog3td2.model.Player;
import org.springframework.stereotype.Component;

@Component
public class playerMapper {
    public playerResponse toRest(Player domain) {
        return playerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public Player toDomain(createPlayerResponse rest) {
        return Player.builder()
                .name(rest.getName())
                .number(rest.getNumber())
                .build();
    }

    public Player toDomain(playerResponse rest) {
        return Player.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }
}
