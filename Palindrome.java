include java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str = "madam";

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
