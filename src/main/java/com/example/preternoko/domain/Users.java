package com.example.preternoko.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Embeddable
public class Users {

    @OneToMany
    private List<User> participant;
}
