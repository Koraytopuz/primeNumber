import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int i = 2;

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int number = inp.nextInt();

        boolean remind = true;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " Sayısı Asal Değildir!");
                remind = false;
                break;
            }

        }
        if (remind == true) {
            System.out.println(number + " Sayısı Asaldır!");
            counter++;
        }
    }
}
