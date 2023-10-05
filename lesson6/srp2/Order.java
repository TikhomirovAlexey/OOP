package Study_2.OOP.homework.lesson6.srp2;

public class Order{

    private GetDataUser getDataUser = new GetDataUser();
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public Order() {
        this.clientName = getDataUser.prompt("Имя клиента: ");
        this.product = getDataUser.prompt("Продукт: ");
        this.qnt = Integer.parseInt(getDataUser.prompt("Кол-во: "));
        this.price = Integer.parseInt(getDataUser.prompt("Цена: "));
    }
}
