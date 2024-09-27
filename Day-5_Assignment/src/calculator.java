public class calculator {

    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a-b;
    }
    public int multiplication(int a, int b) {
        return a*b;
    }
    public double division(int a, int b,double[] remainder) {
        if(b==0){
            System.out.println("Error: Division by zero.");
            return 0;
        }
        remainder[0]=a%b;
        return (double) a/b;
    }
}
