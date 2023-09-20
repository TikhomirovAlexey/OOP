public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public String info() {
        return "plate: " + food;
    }

    public void addFood(int food, int appetite){
        setFood(food + appetite);
        System.out.println("Досыпал корма!");
    }
}
