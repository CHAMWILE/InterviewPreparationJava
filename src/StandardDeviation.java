import java.util.List;
import java.util.ArrayList;

public class StandardDeviation {
    public static void main(String[] args) {
        // Sample data
        List<Double> data = new ArrayList<>();
        data.add(5.0);
        data.add(2.0);
        data.add(9.0);
        data.add(3.0);
        data.add(1.0);

        double mean = calculateMean(data);
        double stdDev = calculateStandardDeviation(data, mean);

        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate the mean of the data
    public static double calculateMean(List<Double> data) {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        return sum / data.size();
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(List<Double> data, double mean) {
        double sumSquaredDifferences = 0;

        for (double num : data) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        double variance = sumSquaredDifferences / data.size(); // For population standard deviation
        return Math.sqrt(variance);  // Taking the square root gives us the standard deviation
    }
}