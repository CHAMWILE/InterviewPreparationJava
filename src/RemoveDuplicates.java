import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Array without duplicates:");
        for (int num : arr) {
            if (!seen.contains(num)) {
                System.out.print(num + " ");
                seen.add(num);
            }
        }
    }
}