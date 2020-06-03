package com.example.web;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Size;

@Data
public class AccountForm {

    @Size(min = 1, max = 127)
    private String category;

    @Size(min = 1, max = 127)
    private String content;

    @Size(min = 1, max = 127)
    private String method;

    @Range(min = 1, max = 127)
    private Integer price;
}