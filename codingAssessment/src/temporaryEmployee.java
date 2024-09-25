public class temporaryEmployee extends Employee{
    int dailyWages;
    int noOfDay;

    temporaryEmployee(int id, String name, int salary, int dailyWages, int noOfDay) {
        super(id, name, 0);
        this.dailyWages = dailyWages;
        this.noOfDay = noOfDay;
        calculateSalary();
        calculateBonus();
    }

    public void calculateSalary(){
        netSalary=dailyWages*noOfDay;
    }
    public void calculateBonus(){
        if(dailyWages<1000){
            bonus=netSalary*0.15f;
        } else if (dailyWages>=1000 && dailyWages<1500) {
            bonus=netSalary*0.12f;
        }else if (dailyWages>=1500 && dailyWages<1750) {
            bonus=netSalary*0.11f;
        }else{
            bonus=netSalary*0.08f;
        }
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Daily Wages: "+dailyWages+"\nNo. of Days Worked: "+noOfDay);
    }
}
