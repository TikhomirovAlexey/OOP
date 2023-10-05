package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Middle implements Observer {
    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Middle(String name) {
        this.name = name;
        minSalary = random.nextDouble(20000, 40000);
    }

    @Override
    public void receiveOffer(String companyName, VacanvyInterface vacancy) {
        if (minSalary <= vacancy.getSalary()){
            System.out.printf("Средний рабочий %s (%f) >>> Мне нужна эта работа! [%s - %f - %s]\n",
                    name, minSalary, companyName, vacancy.getSalary(), vacancy.getType());
            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Средний рабочий %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, vacancy.getSalary());
        }
    }

}
