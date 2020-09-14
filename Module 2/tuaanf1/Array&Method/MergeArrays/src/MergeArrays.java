import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[4];
        System.out.println("input elements of arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("các phần tử trong ar1");
        for (int n : arr1) {
            System.out.printf("%3d", n);
        }

        int[] arr2 = new int[3];
        System.out.println("\ninput elements of arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("các phần tử trong ar2");
        for (int n : arr2) {
            System.out.printf("%3d", n);
        }

        int[] newArray = MergeArray(arr1, arr2);
        System.out.println("\n\n các phần tử tỏng mảng mới: ");
        for (int i : newArray) {
            System.out.printf("%3d", i);
        }
    }

    public static int[] MergeArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < newArr.length; i++) {
            if (i < arr1.length) {
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i - arr1.length];
            }
        }
        return newArr;
    }
}
