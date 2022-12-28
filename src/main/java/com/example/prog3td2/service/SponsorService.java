package com.example.prog3td2.service;



import com.example.prog3td2.model.Sponsor;
import com.example.prog3td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    public List<Sponsor> getSponsors(){
        return repository.findAll();
    }
    public List<Sponsor> postSponsors(List<Sponsor> sponsors){
        return repository.saveAll(sponsors);
    }
    public List<Sponsor> putSponsors(List<Sponsor> sponsors){
        return repository.saveAll(sponsors);
    }

    public void deleteSponsor(int id){
        repository.deleteById(id);
    }

    public Optional<Sponsor> findSponsor(int id){
        return repository.findById(id);
    }
}
