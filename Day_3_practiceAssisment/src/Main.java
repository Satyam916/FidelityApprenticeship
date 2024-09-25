import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BasicMediaPlayer mediaPlayer=new BasicMediaPlayer("Sony","XYZ-100",2022,"MP3,AVI");
        SmartTV smarttv=new SmartTV("LG","13-Smart",2023,55,"YouTube,Netflix");
        HomeTheaterSystem homeTheater=new HomeTheaterSystem("Smasung","HTS-5000",2022,75,"Amazon Prime",true,true);

        while(true){
            System.out.println("\nChoose a device to interact with");
            System.out.println("\t1. Basic Media Player");
            System.out.println("\t2. Smart TV");
            System.out.println("\t3. Home Theater");
            System.out.println("\t4. Exit");
            System.out.println("\nEnter your choice");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("\nBasic Media Player");

                    mediaPlayer.Display();
                    mediaPlayer.play();
                    break;

                case 2:
                    System.out.println("\nSmart TV");
                    smarttv.Display();
                    smarttv.adjustSettings();
                    break;

                case 3:
                    System.out.println("\nHome Theater");
                    homeTheater.Display();
                    homeTheater.controlAudioSettings();
                    break;

                case 4:
                    System.out.println("\nExit");
                    sc.close();
                    return;
                    default:
                        System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}