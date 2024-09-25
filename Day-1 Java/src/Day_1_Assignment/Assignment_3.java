package Day_1_Assignment;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {


        System.out.println("Enter the number of pattern:");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){

            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


