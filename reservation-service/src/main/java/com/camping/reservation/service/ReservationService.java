package com.camping.reservation.service;

import com.camping.reservation.model.Reservation;
import com.camping.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));
    }

    public List<Reservation> getReservationsByUserId(Long userId) {
        return reservationRepository.findByUserId(userId);
    }

    public List<Reservation> getReservationsByCampingCenterId(Long campingCenterId) {
        return reservationRepository.findByCampingCenterId(campingCenterId);
    }

    public Reservation createReservation(Reservation reservation) {
        // Add validation logic here
        reservation.setStatus("PENDING");
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservationStatus(Long id, String status) {
        Reservation reservation = getReservationById(id);
        reservation.setStatus(status);
        return reservationRepository.save(reservation);
    }
} 