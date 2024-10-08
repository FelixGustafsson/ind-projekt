package items;

public abstract class Item {
    protected String name;
    protected double weight;
    protected int price;

    public Item() {}

    public Item(String name, double weightInKilogram, int price) {
        this.name = name;
        this.weight = weightInKilogram;
        this.price = price;
    }
}
