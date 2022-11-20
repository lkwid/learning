package com.linkedinlearning.reactivespring.config;

import com.linkedinlearning.reactivespring.ReactivespringApplication;
import com.linkedinlearning.reactivespring.module.Reservation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

@SpringBootTest(classes = ReactivespringApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiConfigTest {


    private static final String BASE_URL = "http://localhost:8081";
    private static final String BASE_CORS_ON_METHODS_URL = "http://localhost:8080";
    private static final String BASE_CORS_ON_CONTROLLER_URL = "/cors-on-controller";
    private static final String CONTROLLER_CORS_ALLOWED_ORIGIN = "http://allowed-origin.com";
    private static final String CORS_DEFAULT_ORIGIN = "http://localhost:8081";

    private static WebTestClient client;

    @BeforeAll
    public static void setup() {
        client = WebTestClient.bindToServer()
                .baseUrl(BASE_URL)
                .defaultHeader("Origin", CORS_DEFAULT_ORIGIN)
                .build();
    }

    @Test
    public void justConnect() {
        WebTestClient.ResponseSpec response = client.get()
                .uri("http://localhost:8080/room/v1/reservation/1")
                .exchange();

        response.expectHeader()
                .valueEquals("Access-Control-Allow-Origin", CORS_DEFAULT_ORIGIN);
    }

    @Test
    public void saveReservation() {
        WebTestClient.ResponseSpec response = client.post()
                .uri("http://localhost:8080/room/v1/reservation/")
                .body(BodyInserters.fromPublisher(Mono.just(new Reservation()), Reservation.class))
                .exchange();

        response.expectHeader()
                .valueEquals("Access-Control-Allow-Origin", CORS_DEFAULT_ORIGIN);
    }

}
