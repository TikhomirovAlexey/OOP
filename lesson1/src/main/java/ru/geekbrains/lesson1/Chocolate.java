package ru.geekbrains.lesson1;

/**
 * Chocolate - class
 * description - вкус: горький, молочный, белый
 * weight - вес
 * filling - начинка
 */
public class Chocolate extends Product{
    
    private String description;
    private double weight;
    private String filling;
    
    public Chocolate(String brand, String name, double price, String description, double weight, String filling){
        super(brand, name, price);
        this.description = description;
        this.weight = weight;
        this.filling = filling;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getFilling(){
        return filling;
    }

    public void setFilling(String filling){
        this.filling = filling;
    }

    public String displayInfo(){
        return String.format("%s - %s\nмасса: %f, цена: %f\n%s, начинка: %s ", brand, name, weight, price, description, filling);
    }
}