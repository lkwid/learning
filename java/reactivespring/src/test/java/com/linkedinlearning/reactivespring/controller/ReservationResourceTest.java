package com.linkedinlearning.reactivespring.controller;

import com.linkedinlearning.reactivespring.module.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

import javax.xml.transform.Result;
import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ReservationResourceTest {

    @Autowired
    private ApplicationContext context;
    private WebTestClient webTestClient;

    @BeforeEach
    private void setUp() {
        webTestClient = WebTestClient
                .bindToApplicationContext(context)
                .build();
    }

    @Test
    void getAllReservations() {
        webTestClient
                .get().uri("http://localhost:8080/room/v1/reservation/")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(Reservation.class)
                .value(reservations -> assertThat(reservations, empty()));
    }

    @Test
    void createReservation() {
        Reservation reservation = new Reservation(
                100L,
                LocalDate.now().plusDays(5),
                LocalDate.now().plusDays(10),
                150);
        webTestClient.post().uri("http://localhost:8080/room/v1/reservation/")
                .body(BodyInserters.fromPublisher(Mono.just(reservation), Reservation.class))
                .exchange()
                .expectStatus().isOk()
                .expectBody();
    }
}