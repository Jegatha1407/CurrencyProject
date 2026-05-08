import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature:");
        float temperature = sc.nextFloat();

        System.out.println("Enter the unit:");
        char unit = sc.next().charAt(0);

        if (unit == 'F' ) {

            float cel = (temperature - 32) * 5 / 9;
            float kel = cel + 273.15f;

            System.out.println("Temp in Celsius: " + cel);
            System.out.println("Temp in Kelvin: " + kel);

        } 
        else if (unit == 'C' ) {

            float fahren = (temperature * 9 / 5) + 32;
            float kel = temperature + 273.15f;

            System.out.println("Temp in Fahrenheit: " + fahren);
            System.out.println("Temp in Kelvin: " + kel);

        } 
        else if (unit == 'K') {

            float cel = temperature - 273.15f;
            float fahren = (cel * 9 / 5) + 32;

            System.out.println("Temp in Celsius: " + cel);
            System.out.println("Temp in Fahrenheit: " + fahren);

        } 
        else {
            System.out.println("Enter correct unit");
        }

        sc.close();
    }
}