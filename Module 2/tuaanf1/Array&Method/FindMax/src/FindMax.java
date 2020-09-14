import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int [] arr;
        int size;
        do {
            System.out.println("enter size of array: ");
            size = sc.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 10");
        }while (size >10);

        arr = new int[size];
        for (int i =0; i< arr.length; i++){
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest element in the list is " + max + " ,at position " + index);
    }
}
