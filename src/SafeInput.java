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

        do
        {
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
    public static double getDouble(Scanner pipe, String Prompt)
    {
        double retDouble = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.println("\n" + Prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                done = true;
            }
            else
            {
                trash = pipe.next();
                System.out.println("You entered: " + trash + ". Please enter a valid double.");
                done = false;
            }
            pipe.nextLine();
        } while (!done);

        return retDouble;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You entered: " + retInt + ". Please enter a number between " + low + " and " + high + ".");
                    done = false;
                }
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
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.println("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                if (retDouble >= low && retDouble <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You entered: " + retDouble + ". Please enter a number between " + low + " and " + high + ".");
                    done = false;
                }
            }
            else
            {
                trash = pipe.next();
                System.out.println("You entered: " + trash + ". Please enter a valid number.");
                done = false;
            }
            pipe.nextLine();
        } while (!done);

        return retDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retBoolean = false;
        boolean done = false;
        String response = "";

        do
        {
            System.out.println("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                retBoolean = true;
                done = true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                retBoolean = false;
                done = true;
            }
            else
            {
                System.out.println("You entered: " + response + ". Please enter Y or N.");
            }
        } while (!done);

        return retBoolean;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        boolean done = false;

        do
        {
            System.out.println("\n" + prompt + ": ");
            retString = pipe.nextLine();
            if (retString.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("You entered " + retString + ". Try again.");
                done = false;
            }
        } while (!done);

        return retString;
    }
}
