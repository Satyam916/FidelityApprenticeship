public class Category extends Product{
    int CategoryID;
    String CategoryName;

    @Override
    public void display(){
        System.out.println("Enter Category ID: "+CategoryID+"\nCategory Name: "+CategoryName);
        super.display();
    }
}
