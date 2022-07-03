package com.vinigracindo.movies.application;

import com.vinigracindo.movies.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}