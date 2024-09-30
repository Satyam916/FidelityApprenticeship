import java.util.Scanner;

class employeeNotFound extends Exception {

    public employeeNotFound(String message){
        super(message);
    }
}
class Employee{
    private int id;
    private String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
         return name;
    }
}


public class userDefinedException {
    private static Employee[] employees=new Employee[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employees[0]=new Employee(101,"John");
        employees[1]=new Employee(102,"Satyam");
        employees[2]=new Employee(103,"Sitesh");

        System.out.println("Enter Employee ID to search");
        int id = sc.nextInt();
        try{
            Employee employee=findEmployeeByID(id);
            System.out.println("Employee Found"+employee.getName());
        }catch(employeeNotFound e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }

    }
    public static Employee findEmployeeByID(int id) throws employeeNotFound {
        for(Employee e:employees){
            if(e !=null && e.getId()==id){
                return e;
            }
        }
        throw new employeeNotFound("Employee with ID"+id+ " Not Found");
    }
}
