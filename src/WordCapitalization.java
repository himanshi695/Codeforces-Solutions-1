import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
