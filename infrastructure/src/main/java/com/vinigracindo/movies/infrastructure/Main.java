package com.vinigracindo.movies.infrastructure;

import com.vinigracindo.movies.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}