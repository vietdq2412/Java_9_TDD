import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Menu\n" +
                "1.Cel to Fah\n" +
                "2.Fah to Cel\n" +
                "3.Exit\n" +
                "Enter your choice:");
        int choice = sc.nextInt();

        while (choice != 3) {
            switch (choice) {
                case 1:
                    System.out.println(" enter Celsius value: ");
                    double cel = sc.nextFloat();
                    System.out.println("Fah: " + celToFah(cel));
                    break;
                case 2:
                    System.out.println(" enter Fahrenheit value: ");
                    double fah = sc.nextFloat();
                    System.out.println("Cel: " + fahToCel(fah));
                    break;
                default:
                    System.out.println("choose again!");
            }
            System.out.println("Menu\n" +
                    "1.Cel to Fah\n" +
                    "2.Fah to Cel\n" +
                    "3.Exit\n" +
                    "Enter your choice:");
            choice = sc.nextInt();
        }
    }

    public static double celToFah(double cel) {
        double fah = (9.0 / 5) * cel + 32;
        return fah;
    }

    public static double fahToCel(double fah) {
        double cel = (5.0 / 9) * (fah - 32);
        return cel;
    }
}
