package com.example.prog3td2.controller;



import com.example.prog3td2.controller.mapper.playerMapper;
import com.example.prog3td2.controller.response.playerResponse.createPlayerResponse;
import com.example.prog3td2.controller.response.playerResponse.playerResponse;
import com.example.prog3td2.model.Player;
import com.example.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final playerMapper mapper;

    @GetMapping("/Players")
    public List<playerResponse> getPlayers(){
        return service.getPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/Players")
    public List<playerResponse> postPlayers(@RequestBody List<createPlayerResponse> playerList){
        List<Player> players = playerList.stream().map(mapper::toDomain).toList();
        return service.postPlayers(players).stream()
                .map(mapper::toRest)
                .toList();
    }
    @PutMapping("/Players")
    public List<playerResponse> putPlayers(@RequestBody List<playerResponse> players){
        List<Player> toUpdate = players.stream().map(mapper::toDomain).toList();
        return service.putPlayers(toUpdate).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/Players/{id}")
    public void deletePlayers(@PathVariable int id){
        service.deletePlayers(id);
    }

    @GetMapping("/Players/{id}")
    public Optional<Player> findPlayer(@PathVariable int id){
        return service.findPlayers(id);
    }
}
