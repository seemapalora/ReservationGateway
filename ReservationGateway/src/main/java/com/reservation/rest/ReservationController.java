package com.reservation.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.model.Reservation;
import com.reservation.service.ReservationService;

@RestController
public class ReservationController {

	@Autowired
	ReservationService reservationService;
	@RequestMapping(value="/reservation", method= RequestMethod.POST)
	public Reservation createReservation(@RequestBody Reservation reservation) {
		reservationService.createReservation(reservation);
		return reservation;		
	}
	
	@RequestMapping(value="/reservation/{reservationId}", method=RequestMethod.GET)
	public ResponseEntity<Reservation> getReservationByID(@PathVariable Integer reservationId) {
		
		Reservation reservationResponse;
		Optional<Reservation> reservation =	reservationService.getReservationById(reservationId);
		if(reservation.isPresent()) {
			reservationResponse = reservation.get();
			return new ResponseEntity(reservationResponse,HttpStatus.OK);
		}
		else
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}
