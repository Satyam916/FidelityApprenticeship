import java.util.Scanner;

public class string_Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name");
        String lastName = sc.nextLine();

        System.out.println("Your Full Name is:- "+firstName+" "+lastName);

    }
}
