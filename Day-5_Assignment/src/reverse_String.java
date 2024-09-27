import java.util.Scanner;

public class reverse_String {

    public static String reverseString(String sentence) {
        String[] words=sentence.split(" ");
        StringBuilder reverseStr=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            reverseStr.append(words[i]);

            if(i !=0){
                reverseStr.append(" ");
            }
        }

        return reverseStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String s = sc.nextLine();

        String reverse = reverseString(s);
        System.out.println(reverse);
    }
}
