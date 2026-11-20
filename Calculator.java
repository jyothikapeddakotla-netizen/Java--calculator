import java.util.Scanner;

/**
 * A simple console-based calculator supporting +, -, * and /.
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== JAVA CALCULATOR =====");

        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("\nEnter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid number. Enter the first number again: ");
                scanner.next();
            }
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String operatorInput = scanner.next();
            char operator = operatorInput.charAt(0);

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid number. Enter the second number again: ");
                scanner.next();
            }
            double secondNumber = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Result = " + (firstNumber + secondNumber));
                    break;
                case '-':
                    System.out.println("Result = " + (firstNumber - secondNumber));
                    break;
                case '*':
                    System.out.println("Result = " + (firstNumber * secondNumber));
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result = " + (firstNumber / secondNumber));
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Use +, -, * or /.");
            }

            System.out.print("\nDo you want to calculate again? (yes/no): ");
            continueCalculating = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using Java Calculator!");
        scanner.close();
    }
}
