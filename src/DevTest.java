import java.util.Scanner;

public class DevTest
{
    void main()
    {
        Scanner in = new Scanner (System.in);
        String Name = "";
        int Age = 0;

        Name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Your name is " + Name + ".");

        Age = SafeInput.getInt(in, "Enter your age");
        System.out.println("Your age is " + Age + ".");
    }
}