import java.util.Scanner;

public class RemoveAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 5, 6, 8, 4, 11};

        for (int j : arr) {
            System.out.printf("%4d", j);
        }
        System.out.println("\nenter number: ");
        int X = sc.nextInt();

        int[] a = removeElement(X, arr);
        for (int j : a) {
            System.out.printf("%4d", j);
        }
    }

    public static int[] removeElement(int x, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
            }
        }

        for (int i = index; i < arr.length - 1; i++) {
            //int temp = arr[i+1];
            arr[i] = arr[i + 1];
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

}
