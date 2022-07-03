package com.example.preternoko.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Embeddable
public class FormItems {

    @OneToMany
    private List<FormItem> formItems;
}
