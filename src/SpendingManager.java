import java.util.Scanner;

public class SpendingManager {

    public static void main(String[] args) {
        final double MIN_BALANCE = 50.0;  // Minimum threshold

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your starting amount of money: ");

        if (scanner.hasNextDouble()) {
            double balance = scanner.nextDouble();

            if (balance < MIN_BALANCE) {
                System.out.println("Starting amount must be greater than the minimum balance ($50).");
            } else {
                while (balance > MIN_BALANCE) {
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    System.out.print("Enter an expense amount: ");

                    if (scanner.hasNextDouble()) {
                        double expense = scanner.nextDouble();

                        if (expense <= 0) {
                            System.out.println("Expense must be greater than 0. Try again.");
                            continue;
                        }

                        if (expense > balance - MIN_BALANCE) {
                            System.out.println("Warning: Expense too high. It would drop your balance below the minimum allowed.");
                        } else {
                            balance -= expense;
                        }
                    } else {
                        System.out.println("Invalid input: Please enter a numeric value.");
                        scanner.next(); // Clear the invalid input
                    }
                }
                System.out.println("Alert: You have reached the minimum balance of $50.");
            }
        } else {
            System.out.println("Invalid input: Please enter a numeric starting amount.");
        }

        scanner.close();
    }
}