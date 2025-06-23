import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.print("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division ");
        System.out.print("Choose Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();

        int result = 0;
        switch (operator) {
            case 1:
                result = n1 + n2;
                break;
                case 2:
                    result = n1 - n2;
                    break;
                    case 3:
                        result = n1 * n2;
                        break;
                        case 4:
                            result = n1 / n2;
                            break;
                            default:
                                System.out.println("Entered number is not valid");
        }
        System.out.println(result);
    }
}
