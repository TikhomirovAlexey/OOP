// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee{

    private int workTime;

    public Freelancer(String name, String surname, int age, double salary, int workTime) {
        super(name, surname, age, salary);
        this.workTime = workTime;
    }

    @Override
    public double calculateSalary() {
        return salary * workTime;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст - %d; Фрилансер; Среднемесячная заработная плата (сдельная месячная оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }

}
