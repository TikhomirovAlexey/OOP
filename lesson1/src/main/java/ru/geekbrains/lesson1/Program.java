package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product product1;

        product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        //product1.brand = "ООО Лучшая вода";
        //product1.name = "Бутылка с водой";
        //product1.price = -50;
        //product1.name = "A";
        System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);

        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);

        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);

        System.out.println(bottleOfWater1.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product chocolate1 = new Chocolate("Мням Мням", "Быстрое наслаждение", 55, "молочный", 200, "орехи");
        System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("Мням Мням", "Брутальный вкус", 75, "горький", 250, "ликер");
        System.out.println(chocolate2.displayInfo());

        Product chocolate3 = new Chocolate("Мням Мням", "Воздушная радость", 75, "белый", 250, "йогурт");
        System.out.println(chocolate3.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);


        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        Chocolate getChocolateResult = vendingMachine.getChocolate("молочный");
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        if (getChocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(getChocolateResult.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате.");
        }
    }

}
