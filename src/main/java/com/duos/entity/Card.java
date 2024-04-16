package com.duos.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "tier_id")
    private Tier tier;
    @ManyToOne
    @JoinColumn(name = "tribe_id")
    private Tribe tribe;
    @ManyToMany
    private List<Keyword> keywords;

    private List<Card> getCardsByTierAndTribe(Long tierId, List<Long> tribeIds) {
        List<Card> cards = new ArrayList<>();
        for (Keyword keyword : this.keywords) {


        }
    }
}
