package com.duos.repository;

import com.duos.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByTierIdAndTribeIdIn(Long tierId, List<Long> tribeIds);

    @Query("SELECT c FROM Card c JOIN c.keywords k WHERE k.id = :keywordId AND c.tribe.id IN :tribeIds")
    List<Card> findByKeywordIdAndTribeIdIn(Long keywordId, List<Long> tribeIds);
}