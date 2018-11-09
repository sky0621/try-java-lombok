package com.example;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class Builder2 {
    private int id;
    @Singular
    private List<String> names;
}
