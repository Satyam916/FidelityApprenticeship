import java.util.Scanner;

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID:");
        int Product_id=sc.nextInt();
        System.out.println("Enter Product name:");
        Scanner sc1 = new Scanner(System.in);
        String Product_name=sc1.nextLine();
        System.out.println("Enter Category ID:");
        Scanner sc2 = new Scanner(System.in);
        int Category_id=sc2.nextInt();
        System.out.println("Enter Category Name:");
        Scanner sc3 = new Scanner(System.in);
        String Category_name=sc3.nextLine();
        System.out.println("Enter brand name:");
        Scanner sc4 = new Scanner(System.in);
        String brandName=sc4.nextLine();
        System.out.println("Enter Product Price:");
        Scanner sc5 = new Scanner(System.in);
        int price=sc5.nextInt();



        Brand br=new Brand();
        br.initialize(Product_id,Product_name,Category_id,Category_name,brandName,price);
        br.display();

    }
}
