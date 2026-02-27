import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N
        int N = scanner.nextInt();
        
        // Create HashSet
        Set<Integer> set = new HashSet<>();
        
        // Read N integers
        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }
        
        // Print unique numbers (no trailing space)
        boolean first = true;
        for (int num : set) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(num);
            first = false;
        }
        
        scanner.close();
    }
}
