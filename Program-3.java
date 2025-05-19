import java.util.Scanner;

public class OddSeriesBasedOnInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a value (a): ");
        int a = scanner.nextInt();

        // Calculate how many odd numbers to print
        int count = (a % 2 == 0) ? a - 1 : a;

        // Generate and print the odd number series
        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
