public class Product {
    private int Product_id;
    private String Product_name;
   // private String  Category;
    int CategoryID;
    String CategoryName;
    String brandName;
    int price;
    static String Store_name="All In One";


    public static void show(){
        System.out.println("Store Name: "+Store_name);
    }

    public void initialize(int Product_id, String Product_name,int CategoryID,String CategoryName,String brandName,int price) {
        this.Product_id=Product_id;
        this.Product_name=Product_name;
        this.CategoryID=CategoryID;
        this.CategoryName=CategoryName;
        this.brandName=brandName;
        this.price=price;
      //  this.Category=Category;
    }

    public void display() {
        System.out.println("Product ID: "+Product_id+"\nProduct Name: "+Product_name+"\nCategory ID: "+CategoryID+"\nCategory Name: "+CategoryName);
    }

}
