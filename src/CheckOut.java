import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        String trash = "";
        boolean done = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalPrice = itemPrice + totalPrice;
            done = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (done);
        System.out.printf("The total price of your items is: $%.2f", totalPrice);
    }
}
