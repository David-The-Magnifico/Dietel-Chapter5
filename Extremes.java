import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int count = input.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            int value = input.nextInt();
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        int sumOfExtremes = min + max;
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of the extremes: " + sumOfExtremes);
    }
}
