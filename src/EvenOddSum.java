public class EvenOddSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 11, 10, 8, 9, 14, 21};
        int evenSum = 0, oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) evenSum += num;
            else oddSum += num;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Total sum: " + (evenSum + oddSum));
    }
}