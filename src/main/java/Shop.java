import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    //data members
    public static double totalAmount = 0;
    static Product[] inventory = {
            new Product("Business Ritual Women’s Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue"),
            new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth"),
            new Product("Men's Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal"),
            new Product("Organic Turmeric Soap", 11.25, "Bath{ & Beauty", 1),
            new Product("Head First Design Pattern", 37.35, "Books", 3, "{Eric Freeman")
    };

    //getters and setters

    public static Product[] getInventory() {
        return inventory;
    }

    //methods
    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the product index (0-4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4" + "\n"
        // + inventory[index] getter + " : " +
        + "0 : " + inventory[0].getName() + "\n"
        + "1 : " + inventory[1].getName() + "\n"
        + "2 : " + inventory[2].getName() + "\n"
        + "3 : " + inventory[3].getName() + "\n"
        + "4 : " + inventory[4].getName() + "\n"
        );

        //

    }
}