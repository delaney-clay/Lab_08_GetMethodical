import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String header = SafeInput.getNonZeroLenString(in, "Enter a header to display");
        SafeInput.prettyHeader(header);
    }
}
