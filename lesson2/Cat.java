public class Cat {

    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fed = false;
    }

    public boolean isFed() {
        return fed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void getInfoFed(){
        if(fed){
            System.out.printf("%s сытый! Спасибо!\n", name);
        } else {
            System.out.printf("%s голодный! Дай поесть!\n", name);
        }
    }

    public void eat(int food){
        if(food < appetite){
            System.out.printf("%s не будет есть, ему мало! Дай еще!\n", name);
        } else {
            fed = true;
        }
    }
}
