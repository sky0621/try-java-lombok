package com.example.gettersetter;

import com.example.GetterSetter;

public class Main {
    public static void main(String... args) {
        GetterSetter gs = new GetterSetter();
        gs.setText("ABC");
        System.out.println(gs.getText());
    }
}
