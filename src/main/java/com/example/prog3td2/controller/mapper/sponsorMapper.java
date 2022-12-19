package com.example.prog3td2.controller.mapper;


import com.example.prog3td2.controller.response.sponsorResponse.createSponsorResponse;
import com.example.prog3td2.controller.response.sponsorResponse.sponsorResponse;
import com.example.prog3td2.model.Team;
import org.springframework.stereotype.Component;

@Component
public class sponsorMapper {
    public sponsorResponse toRest(Team domain) {
        return sponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public Team toDomain(createSponsorResponse rest) {
        return Team.builder()
                .name(rest.getName())
                .build();
    }
}
