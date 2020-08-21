import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int count=0;
        for (int i = 0; i < ch.length-1 ; i++) {
            if((ch[i] == 'R' && ch[i+1] == 'R') || (ch[i]=='B' && ch[i+1]=='B') || (ch[i]=='G' && ch[i] =='G')){
                count++;
            }
        }
        System.out.println(count);
    }
}
