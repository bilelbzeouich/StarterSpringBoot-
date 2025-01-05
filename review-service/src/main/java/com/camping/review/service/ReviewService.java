package com.camping.review.service;

import com.camping.review.model.Review;
import com.camping.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {
        return reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Review not found"));
    }

    public List<Review> getReviewsByCampingCenterId(Long campingCenterId) {
        return reviewRepository.findByCampingCenterId(campingCenterId);
    }

    public Review createReview(Review review) {
        review.setDatePublished(LocalDate.now());
        return reviewRepository.save(review);
    }
} 