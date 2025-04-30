import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFileAndProcess {
    public static void main(String[] args) {
        ArrayList<int[]> result = new ArrayList<>();

        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line into a string array and convert to integers
                String[] numbersStr = line.split(" ");
                int[] numbers = new int[numbersStr.length];

                for (int i = 0; i < numbersStr.length; i++) {
                    numbers[i] = Integer.parseInt(numbersStr[i]);
                }

                // Find the highest and lowest numbers
                int highest = findHighest(numbers);
                int lowest = findLowest(numbers);

                // Store the result (highest, lowest) as an array
                result.add(new int[]{highest, lowest});
            }

            // Print the result
            System.out.println("Result (highest and lowest per row):");
            for (int[] res : result) {
                System.out.println("Highest: " + res[0] + ", Lowest: " + res[1]);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File not found.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("An error occurred. Ensure the file contains only integers.");
            e.printStackTrace();
        }
    }

    // Helper method to find the highest number in an array
    public static int findHighest(int[] numbers) {
        int highest = numbers[0];
        for (int number : numbers) {
            if (number > highest) {
                highest = number;
            }
        }
        return highest;
    }

    // Helper method to find the lowest number in an array
    public static int findLowest(int[] numbers) {
        int lowest = numbers[0];
        for (int number : numbers) {
            if (number < lowest) {
                lowest = number;
            }
        }
        return lowest;
    }
}