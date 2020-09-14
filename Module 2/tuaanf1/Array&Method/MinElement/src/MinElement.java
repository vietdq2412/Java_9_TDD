import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of element: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("input elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int min = finMin(array);

        System.out.println("phần tử nhỏ nhất: " + min);

    }

    public static int finMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
