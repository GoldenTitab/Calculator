import java.util.Scanner;

public class CombinedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter First Number Dawg:");
            int firstNum = input.nextInt();

            System.out.println("Enter Operator Dawg:");
            char operator = input.next().charAt(0);

            System.out.println("Enter Second Number Dawg:");
            int secondNum = input.nextInt();

            float result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    if (secondNum != 0) {
                        result = (float) firstNum / secondNum;
                    } else {
                        System.out.println("You Can't Divide By Zero Dummie!");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Wrong Key Bro!");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.println("Do you want to continue? (Y/N)");
            choice = input.next().charAt(0);
            input.nextLine(); // consume leftover newline
        } while (choice == 'Y' || choice == 'y');

        input.close();
        System.out.println("Peace out Dawg! ✌️");
    }
}
