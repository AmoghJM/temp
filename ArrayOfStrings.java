import java.util.Scanner;

public class ArrayOfStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length = sc.nextInt();
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < length; i++) {
            arr[i] = sc.next();
        }

        int sum = 0;
        System.out.println("Cumulative length of all the strings are:");
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i].length();
        }
        System.out.println(sum);
    }
}