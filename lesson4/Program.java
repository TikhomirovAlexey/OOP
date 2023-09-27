package Study_2.ООП.homework.lesson4;


public class Program{

    public static void main(String[] args) {

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Box<Orange> boxOrange = new Box<>();
        boxOrange.add(orange1);
        boxOrange.add(orange2);
        boxOrange.add(orange3);
        System.out.println("вес коробки " + boxOrange.getWeight());

        Box<Orange> boxOrange1 = new Box<>();
        boxOrange1.add(orange4);
        boxOrange1.add(orange5);
        System.out.println("вес коробки " + boxOrange1.getWeight());

        Box<Apple> boxApple = new Box<>();
        boxApple.add(apple1);
        boxApple.add(apple2);
        boxApple.add(apple3);
        System.out.println("вес коробки " + boxApple.getWeight());
        System.out.println(boxOrange.compare(boxOrange1));

    }
}