import java.util.Scanner;

public class MatumiziAkiba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter initial balance:");
        double initial = sc.nextDouble();

        System.out.println("Enter number of days:");
        int days = sc.nextInt();

        for (int i = 0; i < days; i++) {
            System.out.println("Enter amount to spend:");
            double expenditure = sc.nextDouble();

            if (initial >= expenditure) {
                initial -= expenditure;
                System.out.println("New balance: " + initial);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
        sc.close();
    }
}