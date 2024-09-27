import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        account acc=new account();
        System.out.println("Enter account id:");
        acc.setId(sc.nextInt());

        System.out.println("Enter account type:");
        acc.setAccountType(sc.next());

        System.out.println("Enter account balance;");
        acc.setBalance(sc.nextDouble());

        System.out.println("Enter amount to withdraw:");
        double amtWithdraw=sc.nextDouble();

        System.out.println(acc.getDetails());

        if(acc.withdraw(amtWithdraw)){
            System.out.println("New Balance: "+acc.getBalance());

        }else{
            System.out.println("Insufficient Balance");
        }

    }
}
