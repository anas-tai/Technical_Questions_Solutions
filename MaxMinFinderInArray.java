public class MaxMinFinderInArray {
    public static void findMaxMin(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println("For arr1:");
        findMaxMin(arr1);

        int[] arr2 = { 5, 3, 7, 4, 2 };
        System.out.println("\nFor arr2:");
        findMaxMin(arr2);
    }
}
