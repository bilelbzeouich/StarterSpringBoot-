package com.camping.reservation.repository;

import com.camping.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUserId(Long userId);
    List<Reservation> findByCampingCenterId(Long campingCenterId);
} 