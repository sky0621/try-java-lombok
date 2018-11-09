package com.example.builder;

import com.example.Builder;

public class Main {
    public static void main(String... args){
        System.out.println(
                Builder.builder()
                        .id(100)
                        .name("名前")
                        .price(937)
                        .publishDate("2018-11-09")
                        .build().toString());
    }
}
