import java.util.Scanner;

public class DevTest
{
    void main()
    {
        Scanner in = new Scanner (System.in);
        String Name = "";
        int Age = 0;
        double price = 0.0;
        int num = 0;
        double length = 0.0;

        Name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Your name is " + Name + ".");

        Age = SafeInput.getInt(in, "Enter your age");
        System.out.println("Your age is " + Age + ".");

        price = SafeInput.getDouble(in, "Enter the price of the item ");
        System.out.println("The price of the item is " + price + ".");

        num = SafeInput.getRangedInt(in, "Pick a number ", 1,10);
        System.out.println("Your number is " + num + ".");

        length = SafeInput.getRangedDouble(in, "Enter the length of a room", 10, 50);
        System.out.println("The length of the room is " + length + ".");
    }
}