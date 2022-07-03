package com.example.preternoko.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    @JoinColumn(name = "reservation_id")
    private Long id;

    private LocalDateTime interviewDate;
    @OneToOne
    private Interview interview;
    private boolean isAccepted;

}
