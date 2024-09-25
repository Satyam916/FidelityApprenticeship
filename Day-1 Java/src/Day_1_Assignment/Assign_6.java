package Day_1_Assignment;

public class Assign_6 {
    public static void main(String[] args) {

        int[] number={2,5,8,11,14,17,20};

        int sum=0;
        for(int i=0;i<number.length;i++){
            if(number[i]%2==0){
                sum+=number[i];
            }
        }
        System.out.println(sum);

    }
}
