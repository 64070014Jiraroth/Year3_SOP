package com.example.lab05_2;

import java.io.Serializable;
import java.util.ArrayList;

public class Word implements Serializable {
    public ArrayList<String> badWords = new ArrayList<>();
    public ArrayList<String> goodWords  = new ArrayList<>();

    public Word() {
        goodWords.add("happy");
        goodWords.add("enjoy");
        goodWords.add("like");
        badWords.add("fuck");
        badWords.add("olo");
    }
}
