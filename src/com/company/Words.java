package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Words {

    public static void wordsType() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> word = new ArrayList<>();
        System.out.println("Введите слова");
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()){
                break;
            }
            word.add(s);
        }
        Collections.sort(word,Collections.reverseOrder());
        for (String s : word) {
            System.out.println(s);
        }
    }
}

