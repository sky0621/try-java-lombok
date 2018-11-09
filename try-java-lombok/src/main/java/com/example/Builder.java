package com.example;

import lombok.ToString;

@lombok.Builder
@ToString
public class Builder {
    private int id;
    private String name;
    private int price;
    private String publishDate;
}
