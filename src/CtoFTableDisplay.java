public class CtoFTableDisplay
{
    public static void main(String[] args) {
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("-------------------------");

        // Loop from -100 to 100 in 1-degree increments using a for loop
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Call the static method to perform the calculation
            double fahrenheit = CtoF(celsius);

            // Print both values in aligned columns with Fahrenheit to 2 decimal places
            System.out.printf("%-10d | %-10.2f\n", celsius, fahrenheit);
        }
    }
    public static double CtoF(double Celsius)
    {
        double retF = 0.0;
        retF = (Celsius * 9.0 / 5.0) + 32.0;
        return retF;
    }
}
