package com.example.prog3td2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    Integer id;
    String Name;
    @OneToMany(
            targetEntity = Player.class,
            mappedBy = "player"
    )
    List<Player> players;
    @ManyToMany(mappedBy = "sponsor",targetEntity = Sponsor.class)
    List<Sponsor> sponsors;
}
