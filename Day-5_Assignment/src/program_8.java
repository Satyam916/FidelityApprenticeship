import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator cal=new calculator();

        System.out.println("Enter the operator:");
        String op = sc.nextLine();

        System.out.println("Enter the operands");
        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();

        switch (op) {
            case "+":
                int additionResult=cal.addition(operand1, operand2);
                System.out.println("Result of "+operand1+" "+operand2+" is"+additionResult);
                break;
                case "-":
                    int subtractionResult=cal.subtraction(operand1, operand2);
                    System.out.println("Subtraction result: "+subtractionResult);
                    break;
                    case "*":
                        int multiplicationResult=cal.multiplication(operand1, operand2);
                        System.out.println("Multiplication result: "+multiplicationResult);
                        break;
                        case "/":
                            double[] remainder=new double[1];
                            double divisionResult=cal.division(operand1,operand2,remainder);
                            System.out.println("Division result: "+divisionResult);
                            System.out.println("Remainder result: "+remainder[0]);
                            break;

                            default:
                                System.out.println("Invalid operator");
                                break;
        }
    }
}
