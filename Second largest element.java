import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 99, 23};
        int largest = arr[0], second = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i]!= largest) {
                second = arr[i];
            }
        }
        System.out.println("Second largest: " + second);
    }
}
