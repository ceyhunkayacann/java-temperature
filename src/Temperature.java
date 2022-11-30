import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığı : ");
        temp = input.nextInt();

        if(temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(temp >= 5 && temp < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (temp >= 15 && temp < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else{
            System.out.println("Yüzebilirsiniz.");
        }
    }
}
