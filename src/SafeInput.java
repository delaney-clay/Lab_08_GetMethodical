import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                done = true;
            }
            else
            {
                trash = pipe.next();
                System.out.println("You entered: " + trash + ". Please enter a valid integer.");
                done = false;
            }
            pipe.nextLine();
        } while (!done);

        return retInt;
    }
}
