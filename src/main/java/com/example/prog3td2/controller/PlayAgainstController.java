package com.example.prog3td2.controller;

import com.example.prog3td2.controller.mapper.playAgainstMapper;
import com.example.prog3td2.controller.response.playagainstResponse.createPlayAgainstResponse;
import com.example.prog3td2.controller.response.playagainstResponse.playAgainstResponse;
import com.example.prog3td2.model.PlayAgainst;
import com.example.prog3td2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService service;
    private final playAgainstMapper mapper;

    @GetMapping("/Match")
    public List<playAgainstResponse> getPlayAgainst(){
        return service.getPlayAgainst().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/Match")
    public List<playAgainstResponse> postPlayAgainst(@RequestBody List<createPlayAgainstResponse> playAgainsts){
        List<PlayAgainst> playAgainst = playAgainsts.stream().map(mapper::toDomain).toList();
        return service.postPlayAgainst(playAgainst).stream()
                .map(mapper::toRest)
                .toList();
    }
    @PutMapping("/Match")
    public List<playAgainstResponse> putPlayAgainst(@RequestBody List<playAgainstResponse> playAgainsts){
        List<PlayAgainst> toUpdate = playAgainsts.stream().map(mapper::toDomain).toList();
        return service.putPlayAgainst(toUpdate).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/Match/{id}")
    public void deletePlayAgainst(@PathVariable int id){
        service.deletePlayAgainst(id);
    }

    @GetMapping("/Match/{id}")
    public Optional<PlayAgainst> findPlayAgainst(@PathVariable int id){
        return service.findPlayAgainst(id);
    }
}
