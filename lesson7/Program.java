package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        VacanvyInterface vacancy1 = new Vacancy("developer", 35000);
        VacanvyInterface vacancy2 = new Vacancy("designer", 75000);
        VacanvyInterface vacancy3 = new Vacancy("manager", 85000);
        Company geekBrains = new Company("GeekBrains",  jobAgency, vacancy1);
        Company google = new Company("Google",  jobAgency, vacancy2);
        Company yandex = new Company("Yandex",  jobAgency, vacancy3);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        Middle smirnov = new Middle("Smirnov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(smirnov);

        for (int i = 0; i < 2; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }

}
