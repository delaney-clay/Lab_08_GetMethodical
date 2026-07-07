import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "^\\d{3}-\\d{2}-\\d{4}$";
        String studentNumber = "^(M|m)\\d{5}$";
        String menuPattern = "^[OoSsVvQq]$";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your Social Security Number in the format XXX-XX-XXXX", SSN);
        System.out.println("Your Social Security Number is: " + SSN);

        studentNumber = SafeInput.getRegExString(in, "Enter your student number in the format MXXXXX", studentNumber);
        System.out.println("Your student number is: " + studentNumber);

        menuChoice = SafeInput.getRegExString(in, "Enter a menu choice: [O - open, S - save, V - view, Q - quit]", menuPattern);
        System.out.println("Your menu choice is " + menuChoice.toUpperCase());
    }
}
