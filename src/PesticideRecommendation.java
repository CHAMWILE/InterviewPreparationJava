import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class PesticideRecommendation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bottleSizes = {20, 15, 10, 5, 3, 1}; // Largest first
        Map<Integer, Integer> bottlesUsed = new LinkedHashMap<>();

        System.out.print("Enter the area to cover (in square metres): ");

        if (scanner.hasNextInt()) {
            int areaToCover = scanner.nextInt();

            if (areaToCover <= 0) {
                System.out.println("Area must be greater than 0.");
                scanner.close();
                return;
            }

            int remainingArea = areaToCover;

            for (int size : bottleSizes) {
                int count = remainingArea / size;
                if (count > 0) {
                    bottlesUsed.put(size, count);
                    remainingArea -= size * count;
                }
            }

            if (remainingArea > 0) {
                System.out.println("Cannot cover the exact area without waste.");
            } else {
                System.out.println("Recommended bottles to use:");
                for (Map.Entry<Integer, Integer> entry : bottlesUsed.entrySet()) {
                    System.out.println(entry.getValue() + " bottle(s) of " + entry.getKey() + " litre(s)");
                }
            }

        } else {
            System.out.println("Invalid input: Please enter a valid integer.");
        }

        scanner.close();
    }
}