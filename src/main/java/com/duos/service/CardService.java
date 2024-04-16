package com.duos.service;

import com.duos.entity.Card;
import com.duos.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public Card getCardById(Long id) {
        return cardRepository.findById(id).orElseThrow();
    }

    public List<Card> getCardsByTier(Long tierId, List<Long> tribeIds) {
        return cardRepository.findByTierIdAndTribeIdIn(tierId, tribeIds);
    }

    public List<Card> getCardsByKeyword(Long keywordId, List<Long> tribeIds) {
        return cardRepository.findByKeywordIdAndTribeIdIn(keywordId, tribeIds);
    }
}
