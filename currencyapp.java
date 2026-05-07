import java.util.Scanner;

public class currencyapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double INR_USD = 83;
        double INR_EUR = 90;

        System.out.println("=== Currency Converter ===");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        double result = 0;

        switch (choice) {

            case 1:
                result = amt / INR_USD;
                System.out.println("USD: " + result);
                break;

            case 2:
                result = amt * INR_USD;
                System.out.println("INR: " + result);
                break;

            case 3:
                result = amt / INR_EUR;
                System.out.println("EUR: " + result);
                break;

            case 4:
                result = amt * INR_EUR;
                System.out.println("INR: " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}