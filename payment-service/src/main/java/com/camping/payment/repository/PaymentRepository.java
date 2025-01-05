package com.camping.payment.repository;

import com.camping.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByReservationId(Long reservationId);
} 