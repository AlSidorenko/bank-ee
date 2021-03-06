package com.company.model.service;

public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЯІЇЄ][а-яіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // E-mail
    String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
    // Phone number
    String REGEX_PHONE = "^[+0-9()_-]{5,20}$";
    // Login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{3,20}$";
    //Password
    String REGEX_PASSWORD = "^[A-Za-z0-9_-]{3,10}$";
}
