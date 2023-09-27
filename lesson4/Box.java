package Study_2.ООП.homework.lesson4;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    
    private ArrayList<T> fruits;


    public Box() {
        fruits = new ArrayList<>();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void add(T addEl){
        fruits.add(addEl);
    }

    public String toString(){
        String tmp = "";
        for (T t : fruits) {
            tmp += t.name + " " + t.weight + "\n";
        }
        return tmp;
    }

    public float getWeight(){
        float sum = 0;
        for (T t : fruits) {
            sum += t.weight;
        }
        return sum;
    }

    public boolean compare(Box<T> o){
        if(o.getWeight() == getWeight()){
            return true;
        } else return false;
    }
}
