package com.example.preternoko.domain.form;

import com.example.preternoko.domain.form.FormItem;
import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Embeddable
public class FormItems {

    @OneToMany
    private List<FormItem> formItems;
}
