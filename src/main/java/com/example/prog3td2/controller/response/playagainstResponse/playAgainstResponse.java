package com.example.prog3td2.controller.response.playagainstResponse;

import com.example.prog3td2.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class playAgainstResponse {
    int id;
    String stadium;
    Date datetime;
    Team host;
    Team opponents;
}
