import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        int[] arr;
        int size;

        do {
            System.out.println("Enter size: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);


        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
