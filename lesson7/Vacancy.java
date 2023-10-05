package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Vacancy implements VacanvyInterface{

    private static Random random = new Random();

    private String type;

    private double salary;

    public Vacancy(String type, double salary) {
        this.type = type;
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

}
