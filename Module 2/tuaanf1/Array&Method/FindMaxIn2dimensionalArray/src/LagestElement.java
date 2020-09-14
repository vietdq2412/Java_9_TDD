import java.util.Scanner;

public class LagestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[2][3];

        System.out.println("input elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("input element for arr" + i);
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
        }
        int max = findMax(array);
        System.out.println("\nlargest element: " + max);


    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
