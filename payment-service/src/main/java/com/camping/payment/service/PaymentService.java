package com.camping.payment.service;

import com.camping.payment.model.Payment;
import com.camping.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment not found"));
    }

    public List<Payment> getPaymentsByReservationId(Long reservationId) {
        return paymentRepository.findByReservationId(reservationId);
    }

    public Payment createPayment(Payment payment) {
        payment.setStatus("PENDING");
        return paymentRepository.save(payment);
    }

    public Payment updatePaymentStatus(Long id, String status) {
        Payment payment = getPaymentById(id);
        payment.setStatus(status);
        return paymentRepository.save(payment);
    }
} 