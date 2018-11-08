package com.example;

import lombok.Data;
import lombok.NonNull;

@lombok.RequiredArgsConstructor
public class RequiredArgsConstructor {
    @NonNull
    private int id;

    @NonNull
    private String text;

    private Data created;
}
