package Study_2.OOP.homework.lesson6.srp2;

public class Progaram {
    public static void main(String[] args) {

        System.out.println("Введите заказ:");
        Order order = new Order();
        
        SaveToJson saveToJson = new SaveToJson();
        saveToJson.saveToJson(order);
    }
}
