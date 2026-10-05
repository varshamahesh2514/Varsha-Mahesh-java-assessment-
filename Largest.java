import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 99, 23};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest: " + max);
    }
}
