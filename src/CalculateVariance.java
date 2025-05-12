public class CalculateVariance {
    public static void main(String[] args) {
        double[] data = {10, 20, 30, 40, 50};
        double mean = 0;

        for (double val : data) {
            mean += val;
        }
        mean /= data.length;
        System.out.println("Mean: " + mean);

        double variance = 0;
        for (double val : data) {
            variance += Math.pow(val - mean, 2);
        }
        variance /= data.length;
        System.out.println("Variance: " + variance);

        double stdDev = Math.sqrt(variance);
        System.out.println("Standard Deviation: " + stdDev);
    }
}
