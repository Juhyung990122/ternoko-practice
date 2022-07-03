package com.example.preternoko.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    @JoinColumn(name = "interview_id")
    private Long id;

    @Embedded
    private FormItems preQuesitons;

    @Embedded
    private Users participant;

    @OneToOne
    private Feedback feedback;

    @OneToOne
    private Reservation reservation;

    @Enumerated(EnumType.STRING)
    private InterviewStatus status;
}
