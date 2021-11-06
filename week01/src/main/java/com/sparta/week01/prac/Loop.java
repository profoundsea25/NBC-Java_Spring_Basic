package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        for (int i=0; i<fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }

        // 줄여쓰기 1
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 줄여쓰기 2
        fruits.forEach(System.out::println);
    }
}
