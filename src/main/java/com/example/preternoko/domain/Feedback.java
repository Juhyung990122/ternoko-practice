package com.example.preternoko.domain;

import com.example.preternoko.domain.form.FormItems;
import com.example.preternoko.domain.interview.Interview;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @OneToOne
    private Interview interview;

    @Embedded
    private FormItems feedbackContent;

}
