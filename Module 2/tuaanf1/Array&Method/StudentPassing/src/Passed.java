import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        //System.out.println("enter numbers of student: ");
        int numbers;

        do {
            System.out.println("enter numbers of student: ");
            numbers = sc.nextInt();
        } while (numbers > 30 || numbers < 0);

        int[] scores = new int[numbers];

        fillArray(scores);
        showArray(scores);

        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 50) {
                count++;
            }
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void showArray(int[] arr) {
        for (int j : arr) {
            System.out.printf("%4d", j);
        }
    }

}
