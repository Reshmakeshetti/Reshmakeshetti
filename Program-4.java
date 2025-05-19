import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Input list of integers
        List<Integer> input = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        // Map to store count of multiples for numbers 1 through 9
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Initialize map with keys 1 to 9 and value 0
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Check each number for divisibility by 1 to 9
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        // Print output in dictionary format
        System.out.println("Output:");
        System.out.println(result);
    }
}
