import java.util.Scanner;

public class NumberOfAChar {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("input a string: ");
        String str = sc.nextLine();

        System.out.println("emter a character: ");
        String c = sc.next();

        int count = 0;
        for (int i = 0; i < str.length(); i++){
            boolean check = c.equals(str.charAt(i)+"");
            if (check) count++;
        }

        System.out.println(c+ " appear "+ count + " times in the string");
    }
}
