public class Employee {
    int employeeID;
    String employeeName;
    float employeeSalary;
    float bonus;
    float netSalary;

    Employee(int employeeID, String employeeName, float employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;

    }

    public void Display(){
        System.out.println("Employee ID: " + employeeID+"\nEmployee Name: " + employeeName+"\nEmployee Salary: " + employeeSalary+"\nBonus: " + bonus+"\nNet Salary: " + netSalary);
    }

}
