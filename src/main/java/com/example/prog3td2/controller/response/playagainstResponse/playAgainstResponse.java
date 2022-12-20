package com.example.prog3td2.controller.response.playagainstResponse;

import com.example.prog3td2.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class playAgainstResponse {
    private int id;
    private Date datetime;
    private Team home;
    private List<Team> guest;
}
