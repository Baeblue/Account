package com.example.web;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AccountForm {
    //@NotNull
    @Size(min = 1, max = 127)
    private String category;

    //@NotNull
    @Size(min = 1, max = 127)
    private String content;

    //@NotNull
    @Size(min = 1, max = 127)
    private String method;

    //@NotNull
    @Range(min = 1, max = 127)
    private Integer price;
}
