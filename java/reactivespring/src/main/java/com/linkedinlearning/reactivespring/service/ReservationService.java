package com.linkedinlearning.reactivespring.service;

import com.linkedinlearning.reactivespring.module.Reservation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReservationService {

    Mono<Reservation> getReservation(final String id);

    Mono<Reservation> createReservation(final Mono<Reservation> reservation);

    Mono<Reservation> updateReservation(final String id, final Mono<Reservation> reservation);

    Mono<Boolean> deleteReservation(final String id);

    Flux<Reservation> getAllReservations();

}
