package com.duos.service;

import com.duos.entity.Wishlist;
import com.duos.repository.WishlistRepository;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {
    private final WishlistRepository wishlistRepository;

    public WishlistService(WishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    public Wishlist getWishlistById(Long id) {
        return wishlistRepository.findById(id).orElseThrow();
    }
}
