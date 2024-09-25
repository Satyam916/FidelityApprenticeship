package Day_1_Assignment;

import java.util.Scanner;

public class Practice2 {
   /* public static int calculate_num(int[] num,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+num[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] num=new int[size];

        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
     int average=calculate_num(num,size);
        System.out.println(average);
  }*/
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               System.out.print("* ");
            }
            System.out.println();
        }

    }*/
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
