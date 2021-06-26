package com.testfaceclub.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("es-ES"));

    private String name, lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public DataInjection(){
        this.name = faker.name().name();
        this.lastName = faker.name().lastName();
    }

}
