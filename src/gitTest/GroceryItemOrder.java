package gitTest;

public class GroceryItemOrder {

    String name;
    int quant;
    int price;

    public GroceryItemOrder(String name, int quant, int price) {
        this.name = name;
        this.quant = quant;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuant() {
        return quant;
    }

    public int getCost() {
        return price;
    }

    @Override
    public String toString() {
        return "Navn: " + name + " Antal: " + quant + " Pris: " + price + "kr.";
    }
}
