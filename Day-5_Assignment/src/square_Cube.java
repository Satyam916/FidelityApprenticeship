import java.util.Scanner;

public class square_Cube {

     static double findSquare(double sqr){
         return sqr*sqr;
     }
     static double findCube(double cube){
         return Math.pow(cube,3);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number = sc.nextDouble();
        System.out.println("The square of " + number + " is " + findSquare(number));
        System.out.println("The cube of " + number + " is " + findCube(number));

    }
}
