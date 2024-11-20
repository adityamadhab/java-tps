// Program to sort the words in a sentence alphabetically
import java.util.Arrays;
import java.util.Scanner;

public class j15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+"); // Split sentence into words
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER); // Sort words alphabetically

        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
