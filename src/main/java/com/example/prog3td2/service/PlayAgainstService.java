package com.example.prog3td2.service;

import com.example.prog3td2.model.PlayAgainst;
import com.example.prog3td2.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private final PlayAgainstRepository repository;

    public List<PlayAgainst> getPlayAgainst(){
        return repository.findAll();
    }
    public List<PlayAgainst> postPlayAgainst(List<PlayAgainst> playAgainsts){
        return repository.saveAll(playAgainsts);
    }
    public List<PlayAgainst> putPlayAgainst(List<PlayAgainst> playAgainsts){
        return repository.saveAll(playAgainsts);
    }

    public void deletePlayAgainst(int id){
        repository.deleteById(id);
    }

    public Optional<PlayAgainst> findPlayAgainst(int id){
        return repository.findById(id);
    }
}
