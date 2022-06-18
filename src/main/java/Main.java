import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        if (0<=userInput && userInput<= 4) {
            do {Shop.displayMenu();
                userInput = Integer.parseInt((scanner.nextLine()));
                if (0 <= userInput && userInput <= 4) {
                    if (Product.buy() == true) {
                        Shop.totalAmount += Product.getPrice();
                        System.out.println("Your purchase was successful " + formatter.format(Shop.totalAmount)
                        );

                    } else System.out.println("Sorry! This product is out of stock!");
                }
            }while (0 <= userInput && userInput <= 4) ;
        } else System.out.println("Thank you for shopping with us! The total amount due is " + formatter.format(Shop.totalAmount));
    }
}