import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        int[] array = {8, 6, 5, 2, 3, 44, 6, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }

        System.out.println("\ninput number want to push: ");
        int x = sc.nextInt();
        System.out.println("input index to add:");
        int index = sc.nextInt();

        int[] newArray = addElement(index, x, array);
        for (int i : newArray) {
            System.out.printf("%4d", i);
        }

    }

    public static int[] addElement(int index, int x, int[] arr) {
        int[] newArr = new int[arr.length + 1];
        if (arr.length - index >= 0) System.arraycopy(arr, index, newArr, index + 1, arr.length - index);

        newArr[index] = x;

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
