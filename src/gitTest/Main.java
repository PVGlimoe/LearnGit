package gitTest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        GroceryItemOrder banan = new GroceryItemOrder("banan", 5, 10);
        GroceryItemOrder apple = new GroceryItemOrder("apple", 6, 11);
        GroceryItemOrder orange = new GroceryItemOrder("orange", 3, 7);
        GroceryItemOrder pear = new GroceryItemOrder("pear", 7, 15);
        GroceryItemOrder cucumber = new GroceryItemOrder("cucumber", 50, 500);
        GroceryItemOrder beer = new GroceryItemOrder("beer", 10, 90);
        GroceryItemOrder chips = new GroceryItemOrder("chips", 1, 17);
        GroceryItemOrder steak = new GroceryItemOrder("steak", 2, 49);
        GroceryItemOrder bread = new GroceryItemOrder("bread", 8, 12);
        GroceryItemOrder wine = new GroceryItemOrder("wine", 15, 268);



        System.out.println(Arrays.toString(groceryList.listOfgroceryItems));

    }
}
