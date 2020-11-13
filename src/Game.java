

import java.util.Scanner;
import java.io.*;
import java.awt.*;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String sol[] = new String[t];
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int one = 0;
            int zero = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
            if (Math.min(zero, one) % 2 == 0) {
                sol[i] = "NET";
            } else {
                sol[i] = "DA";
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(sol[i]);
        }
    }
}