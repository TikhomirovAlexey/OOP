package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private static  Random random = new Random();
    private String companyName;
    private  double maxSalary;
    private Publisher jobAgency;

    private VacanvyInterface vacancy;


    public Company(String companyName, Publisher jobAgency, VacanvyInterface vacancy) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        jobAgency.sendOffer(companyName, vacancy);
    }


}
