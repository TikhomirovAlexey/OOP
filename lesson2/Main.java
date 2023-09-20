import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Бобби", 20);
        Cat cat2 = new Cat("Томми", 10);
        Cat cat3 = new Cat("Вилли", 30);
        Cat cat4 = new Cat("Дилли", 15);

        Plate plate1 = new Plate(50);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        for (Cat cat : cats) {
            cat.eat(plate1.getFood());
            if(cat.isFed()){
                plate1.setFood((plate1.getFood() - cat.getAppetite()));
            }else{
                plate1.addFood(plate1.getFood(), cat.getAppetite());
                cat.eat(plate1.getFood());
            }
            cat.getInfoFed();
        }
    }
}
