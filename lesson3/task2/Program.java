import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     *  TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int randomWorkerNumber = random.nextInt(2);
        int randomAge = random.nextInt(18, 65);

        Employee randomWorker = null;

        if(randomWorkerNumber == 0){
            int salary = random.nextInt(20000, 80000);
            randomWorker = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], randomAge, salary);
        }    
        if(randomWorkerNumber == 1){
            int salary = random.nextInt(1000, 3001);
            int workTime = random.nextInt(16, 73);
            randomWorker = new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], randomAge, salary, workTime);
        }
        return randomWorker;
    }


    /**
     *   TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        for (Employee employee: employees) {
            System.out.println(employee);
        }



    }

}
