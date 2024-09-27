import java.util.Scanner;

public class booleanResult {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
         x=sc.nextInt();
         System.out.println("Enter the value of y: ");
         y=sc.nextInt();

         boolean result=(x<y);
         System.out.println("The result of whether x is less than y is: "+result);

    }
}
