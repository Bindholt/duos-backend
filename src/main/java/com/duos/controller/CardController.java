package com.duos.controller;

import com.duos.entity.Card;
import com.duos.entity.Tribe;
import com.duos.service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public ResponseEntity<List<Card>> getAllCards() {
        return ResponseEntity.ok(cardService.getAllCards());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Card> getCardById(@PathVariable Long id) {
        return ResponseEntity.ok(cardService.getCardById(id));
    }

    @GetMapping("/tribes/tiers/{tierId}")
    public ResponseEntity<List<Card>> getCardsByTier(@PathVariable Long tierId, @RequestBody List<Long> tribeIds) {
        return ResponseEntity.ok(cardService.getCardsByTier(tierId, tribeIds));
    }

    @GetMapping("/tribes/keywords/{keywordId}")
    public ResponseEntity<List<Card>> getCardsByKeyword(@PathVariable Long keywordId, @RequestBody List<Long> tribeIds) {
        return ResponseEntity.ok(cardService.getCardsByKeyword(keywordId, tribeIds));
    }
}
