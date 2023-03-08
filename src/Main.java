import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to print in the Fibonacci Series = ");

        try {
            // Scans the input number.
            int number = Integer.parseInt(scanner.nextLine());

            // Stores the first two numbers of the series.
            int a = 0, b = 1;

            // Stores the upcoming number in the series.
            int c;

            // Prints the first two numbers of the series.
            System.out.print(a + " " + b + " ");

            // Prints the rest numbers of the series.
            for (int i = 0; i < number - 2; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        } catch (NumberFormatException e) {
            System.out.println("You've not entered a whole number.");
        }
    }
}
