import java.util.Scanner;

public class ElementFinder {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("enter student's name: ");
        String name = sc.next();
        boolean isNot = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println(name + " is in the list");
                isNot = false;
                break;
            } else {
                isNot = true;
            }
        }
        if (isNot) {
            System.out.println(name + " is not in the list");
        }
    }
}
