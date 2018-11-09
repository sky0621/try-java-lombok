package com.example;

public class NonNull {
    private int id;
    @lombok.NonNull
    private String name;

    public void setNonNull(@lombok.NonNull Book book) {
        this.name = book.getName();
    }
}
