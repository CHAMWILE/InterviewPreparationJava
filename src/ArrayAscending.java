public class ArrayAscending {
    public static void main(String[] args) {
        int[] arr = {56, 34, 23, 8, 50};
        int temp = 0;

        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Sorting in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted array (Ascending):");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nThird largest element: " + arr[arr.length - 3]);
    }
}
