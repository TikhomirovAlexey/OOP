package Study_2.ООП.homework.lesson7;

import java.util.Random;

public class Middle implements Observer{

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Middle(String name) {
        this.name = name;
        minSalary = random.nextDouble(20000, 40000);
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (minSalary <= salary){
            System.out.printf("Средний рабочий %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, companyName, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Средний рабочий %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, salary);
        }
    }
    
}
