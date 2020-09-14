import java.util.Scanner;

public class MainDiagonalLine {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("enter size of square: ");
        int size = sc.nextInt();

        int[][] array = new int[size][size];
        fillElement(array);
        showArr(array);

        int sum = sumDuongCheoChinh(array);
        System.out.println("\nsum = " + sum);
    }

    public static void fillElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    ;

    public static void showArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
        }
    }

    public static int sumDuongCheoChinh(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
