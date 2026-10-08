import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};

        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
}