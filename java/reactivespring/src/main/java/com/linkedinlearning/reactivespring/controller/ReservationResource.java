package com.linkedinlearning.reactivespring.controller;

import com.linkedinlearning.reactivespring.module.Reservation;
import com.linkedinlearning.reactivespring.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
//@CrossOrigin
@RequestMapping(ReservationResource.ROOM_V1_RESERVATION)
public class ReservationResource {
    public static final String ROOM_V1_RESERVATION = "/room/v1/reservation/";
    private final ReservationService reservationService;

    @GetMapping("{id}")
    public Mono<Reservation> getRservationById(@PathVariable String id) {
        return reservationService.getReservation(id);
    }

    @GetMapping("")
    public Flux<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping("")
    public Mono<Reservation> createReservation(@RequestBody Mono<Reservation> reservation) {
        return reservationService.createReservation(reservation);
    }

    @PutMapping("{id}")
    public Mono<Reservation> updatePrice(@PathVariable String id, @RequestBody Mono<Reservation> reservation) {
        return reservationService.updateReservation(id, reservation);
    }

    @DeleteMapping("{id}")
    public Mono<Boolean> deleteReservation(@PathVariable String id) {
        return reservationService.deleteReservation(id);
    }

}
