package com.example.demo;

import org.springframework.stereotype.Component;


import java.util.ArrayList;

@Component
public class Sentence {
    public ArrayList<String> badSentences;
    public ArrayList<String> goodSentences;

    public Sentence() {
        this.badSentences = new ArrayList<String>();
        this.goodSentences = new ArrayList<String>();
    }

}