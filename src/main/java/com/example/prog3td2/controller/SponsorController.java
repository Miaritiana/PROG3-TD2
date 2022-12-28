package com.example.prog3td2.controller;



import com.example.prog3td2.controller.mapper.sponsorMapper;
import com.example.prog3td2.controller.response.sponsorResponse.createSponsorResponse;
import com.example.prog3td2.controller.response.sponsorResponse.sponsorResponse;
import com.example.prog3td2.model.Sponsor;
import com.example.prog3td2.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService service;
    private final sponsorMapper mapper;

    @GetMapping("/Sponsor")
    public List<sponsorResponse> getSponsors(){
        return service.getSponsors().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/Sponsor")
    public List<sponsorResponse> postSponsors(@RequestBody List<createSponsorResponse> toCreate){
        List<Sponsor> sponsors = toCreate.stream().map(mapper::toDomain).toList();
        return service.postSponsors(sponsors).stream()
                .map(mapper::toRest)
                .toList();
    }
    @PutMapping("/Sponsor")
    public List<sponsorResponse> putPlayAgainst(@RequestBody List<sponsorResponse> sponsors){
        List<Sponsor> toUpdate = sponsors.stream().map(mapper::toDomain).toList();
        return service.putSponsors(toUpdate).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/Sponsor/{id}")
    public void deleteSponsor(@PathVariable int id){
        service.deleteSponsor(id);
    }

    @GetMapping("/Sponsor/{id}")
    public Optional<Sponsor> findSponsor(@PathVariable int id){
        return service.findSponsor(id);
    }
}
