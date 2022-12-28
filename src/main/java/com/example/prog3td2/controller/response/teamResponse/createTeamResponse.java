package com.example.prog3td2.controller.response.teamResponse;

import com.example.prog3td2.model.Player;
import com.example.prog3td2.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class createTeamResponse {
    String name;
    List<Player> players;
    List<Sponsor> sponsors;
}
