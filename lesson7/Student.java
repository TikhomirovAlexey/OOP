package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();
    private String name;

    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
    }

    @Override
    public void receiveOffer(String companyName, VacanvyInterface vacancy) {
        if (minSalary <= vacancy.getSalary()){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! [%s - %f - %s]\n",
                    name, minSalary, companyName, vacancy.getSalary(), vacancy.getType());
            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, vacancy.getSalary());
        }
    }
}
