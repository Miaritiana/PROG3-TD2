package com.example.prog3td2.service;

import com.example.prog3td2.model.Player;
import com.example.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<Player> getPlayers(){
        return repository.findAll();
    }
    public List<Player> postPlayers(List<Player> players){
        return repository.saveAll(players);
    }
    public List<Player> putPlayers(List<Player> players){
        return repository.saveAll(players);
    }

    public void deletePlayers(long id){
        repository.deleteById(id);
    }

    public Optional<Player> findPlayers(long id){
        return repository.findById(id);
    }
}
