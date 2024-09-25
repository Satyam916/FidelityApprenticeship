package Day_1_Assignment;

import java.util.Scanner;

public class Assign_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible to do voting");
        }
        else{
            System.out.println("You are not eligible to do voting");
        }
    }
}
