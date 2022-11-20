package com.linkedinlearning.reactivespring.module;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document
@NoArgsConstructor
@RequiredArgsConstructor
public class Reservation {

    @NonNull
    @Getter @Setter
    private Long roomNumber;
    @NonNull
    @Getter @Setter
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkIn;
    @NonNull
    @Getter @Setter
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkOut;
    @NonNull
    @Getter @Setter
    private Integer price;

    @Id
    @Getter
    private String id;



}
