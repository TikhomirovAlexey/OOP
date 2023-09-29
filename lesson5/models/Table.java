package Study_2.ООП.homework.lesson5.models;

public class Table {

    private static int counter = 100;
    private final int no;

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
