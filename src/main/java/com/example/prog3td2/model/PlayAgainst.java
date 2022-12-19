package com.example.prog3td2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayAgainst {
    @Id
    int id;
    String Stadium;
    Date Datetime;
    @OneToOne
    Team Host;
    @OneToOne
    Team Guest;
}
