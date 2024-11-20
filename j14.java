// Program to count the frequency of each character in a string
import java.util.HashMap;
import java.util.Scanner;

public class j14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (char ch : frequency.keySet()) {
            System.out.println(ch + ": " + frequency.get(ch));
        }
    }
}

