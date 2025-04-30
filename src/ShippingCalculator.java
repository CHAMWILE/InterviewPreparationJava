import java.util.Scanner;

public class ShippingCalculator {

    public static void main(String[] args) {
        final double MAX_CBM = 50.0;     // Maximum allowed CBM
        final double PRICE_PER_CBM = 100.0;  // Price per CBM in dollars

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cubic meter (CBM) of your luggage: ");

        if (scanner.hasNextDouble()) {
            double cbm = scanner.nextDouble();

            if (cbm > MAX_CBM) {
                System.out.println("Alert: Your luggage exceeds the maximum allowed size of 50 CBM.");
            } else if (cbm <= 0) {
                System.out.println("Invalid input: CBM must be greater than 0.");
            } else {
                double totalCost = cbm * PRICE_PER_CBM;
                System.out.printf("Your total shipping cost is: $%.2f%n", totalCost);
            }
        } else {
            System.out.println("Invalid input: Please enter a numeric value for CBM.");
        }

        scanner.close();
    }
}
