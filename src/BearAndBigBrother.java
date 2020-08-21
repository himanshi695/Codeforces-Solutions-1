import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        if (n >= 2 && n <= 1000) {

            System.out.println(n);
        }
        int initialPass = sc.nextInt();
        sc.nextLine();
        int initialEntered = sc.nextInt();
        sc.nextLine();
        System.out.println(initialPass + " " + initialEntered);
        int temp;
        int[] array = new int[n];
        array[0] = initialPass + initialEntered;
        for (int i = 1; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + " " + b);
            temp = array[i - 1] - a;
            temp = temp + b;
            array[i] = temp;
        }
        int max = Arrays.stream(array).max().getAsInt();
        if (max <= 0) {
            System.out.println("0");
        } else {
            System.out.println(max);
        }
    }
}
//4
//      0 3
//    2 5
//  4 2
//4 0

//4
//      0 3
//    2 5
//  4 2
//4 0