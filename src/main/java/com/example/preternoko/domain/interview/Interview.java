package com.example.preternoko.domain.interview;

import com.example.preternoko.domain.Feedback;
import com.example.preternoko.domain.Reservation;
import com.example.preternoko.domain.form.FormItems;
import com.example.preternoko.domain.user.Users;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
