package com.reservation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.model.Reservation;
import com.reservation.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	ReservationRepository reservationRepository;
	public Reservation createReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	public Optional<Reservation> getReservationById(Integer reservationId) {
		return reservationRepository.findById(reservationId);
	}
}
