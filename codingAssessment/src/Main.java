//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        permanentEmployee emp1=new permanentEmployee(101,"Esther",25000,1500);
        System.out.println("Permanent Employee Details");
        emp1.Display();
        System.out.println();

        temporaryEmployee emp2=new temporaryEmployee(102,"Ganesh",0,1500,20);
        System.out.println("Temporary Employee Details");
        emp2.Display();

    }
}