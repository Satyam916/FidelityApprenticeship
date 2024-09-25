package Day_1_Assignment;

public class Assign_1 {
    public static int calculate_Avg(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum/num.length;
    }
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
        int average=calculate_Avg(num);
        System.out.println(average);
    }
}
