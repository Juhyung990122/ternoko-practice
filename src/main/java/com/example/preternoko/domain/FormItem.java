package com.example.preternoko.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FormItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    @JoinColumn(name = "formItem_id")
    private Long id;

    @Column(updatable = false)
    private String question;
    private String answer;

}
