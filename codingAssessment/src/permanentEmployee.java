public class permanentEmployee extends Employee {
    int pf;

    permanentEmployee(int employeeID,String employeeName,float employeeSalary,int pf) {
        super(employeeID,employeeName,employeeSalary);
        this.pf = pf;
        calculateSalary();
        calculateBonus();
    }

    public void calculateSalary(){
        netSalary=employeeSalary-pf;
    }
    public void calculateBonus(){
        if(pf<1000){
            bonus=employeeSalary*0.10f;
        } else if(pf>=1000 && pf<1500){
            bonus=employeeSalary*0.115f;
        } else if(pf>=1500 && pf<1800){
            bonus=employeeSalary*0.12f;
        } else{
            bonus=employeeSalary*0.15f;
        }
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("PF:"+pf);
    }
}
