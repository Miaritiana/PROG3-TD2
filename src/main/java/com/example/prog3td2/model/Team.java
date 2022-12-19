package com.example.prog3td2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "team")
@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @OneToMany
    List<Player> players;
    @JoinTable(name = "haveSponsor")
    @ManyToMany(mappedBy = "sponsor",targetEntity = Sponsor.class)
    List<Sponsor> sponsors;
}
