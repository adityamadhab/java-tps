// Program to remove duplicates from an array
import java.util.Scanner;
import java.util.HashSet;

public class j11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        System.out.println("Array after removing duplicates:");
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                System.out.print(num + " ");
            }
        }
    }
}
