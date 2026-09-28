import java.util.Scanner ;
public class StringMethods {
    public static void main(String[] args) {
        String text = " Hello World ";

        String trimmedText = text.trim();
        String upperText = trimmedText.toUpperCase();
        int length = upperText.length();

        System.out.println(trimmedText);
        System.out.println(upperText);
        System.out.println(length);
    }
}
