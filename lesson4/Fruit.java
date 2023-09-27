package Study_2.ООП.homework.lesson4;

public abstract class Fruit {
    
    protected float weight;
    protected String name;

    public String getName() {
        return name;
    }

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }
}
