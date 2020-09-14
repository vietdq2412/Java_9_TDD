import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        int[][] array = new int[6][4];
        fillElement(array);
        showArr(array);

        System.out.println("\n\ninput column number(1-4): ");
        int colNum = sc.nextInt();
        while (colNum !=5) {
            int sum = sumColum(colNum, array);
            System.out.println("sum = " + sum);

            System.out.println("\n\ninput column number(1-4): ");
            System.out.println("enter 5 to exit");
            colNum = sc.nextInt();
        }
    }

    ;

    public static void fillElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    ;

    public static void showArr(int[] @NotNull [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
        }
    }

    ;

    public static int sumColum(int col, int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col - 1];
        }
        return sum;
    }
}
