import java.util.Scanner;

public class Brand extends Category {
    String brandName;
    int price;

     @Override
    public void display(){
        System.out.println("Brand: " + brandName+"\nPrice: " + price);
        super.display();
    }
}
