package com.linkedinlearning.reactivespring.service;

import com.linkedinlearning.reactivespring.module.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReactiveMongoOperations mongoOperations;

    @Override
    public Mono<Reservation> getReservation(String id) {
        return mongoOperations.findById(id, Reservation.class);
    }


    @Override
    public Flux<Reservation> getAllReservations() {
        return mongoOperations.findAll(Reservation.class);
    }

    @Override
    public Mono<Reservation> createReservation(Mono<Reservation> reservation) {
        return mongoOperations.save(reservation);
    }

    @Override
    public Mono<Reservation> updateReservation(String id, Mono<Reservation> reservation) {
        return reservation.flatMap(r ->
                mongoOperations.findAndModify(
                        Query.query(Criteria.where("id").is(id)),
                        Update.update("price", r.getPrice()), Reservation.class
                )).flatMap(result -> {
            result.setPrice(result.getPrice());
            return Mono.just(result);
        });
    }

    @Override
    public Mono<Boolean> deleteReservation(String id) {
        return mongoOperations.remove(
                Query.query(Criteria.where("id").is(id)), Reservation.class
        ).flatMap(deleteResult -> Mono.just(deleteResult.wasAcknowledged()));
    }

}
