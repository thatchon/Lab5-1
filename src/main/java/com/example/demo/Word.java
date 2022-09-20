package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Word {
    public ArrayList<String> badWords;
    public ArrayList<String> goodWords;

    public Word() {
        this.badWords = new ArrayList<>();
        this.goodWords = new ArrayList<>();
    }
}