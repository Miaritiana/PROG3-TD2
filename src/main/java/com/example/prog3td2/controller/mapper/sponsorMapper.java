package com.example.prog3td2.controller.mapper;


import com.example.prog3td2.controller.response.sponsorResponse.createSponsorResponse;
import com.example.prog3td2.controller.response.sponsorResponse.sponsorResponse;
import com.example.prog3td2.model.Sponsor;
import org.springframework.stereotype.Component;

@Component
public class sponsorMapper {
    public sponsorResponse toRest(Sponsor domain) {
        return sponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public Sponsor toDomain(createSponsorResponse rest) {
        return Sponsor.builder()
                .name(rest.getName())
                .build();
    }

    public Sponsor toDomain(sponsorResponse rest) {
        return Sponsor.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }
}
