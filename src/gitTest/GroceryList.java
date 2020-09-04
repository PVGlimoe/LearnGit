package gitTest;

import java.util.Arrays;

public class GroceryList {

    GroceryItemOrder[] listOfgroceryItems = new GroceryItemOrder[10];
    private int listNumber = 0;


    @Override
    public String toString() {
        return "GroceryList{" +
                "listOfgroceryItems=" + Arrays.toString(listOfgroceryItems) +
                '}';
    }

    public void addItemToGroceryItems(GroceryItemOrder item){
        if (listOfgroceryItems[9] == null){
            listOfgroceryItems[listNumber] = item;
            listNumber++;
        } else {
            System.out.println("Du har allerede 10 ting på listen");
        }

    }
}
