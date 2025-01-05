package com.camping.review.repository;

import com.camping.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByCampingCenterId(Long campingCenterId);
} 