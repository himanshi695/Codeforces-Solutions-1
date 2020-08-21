import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1=sc.nextLine();
        char[] ch2=s1.toCharArray();
        char[] ch = s.toCharArray();
        int count=0;
        char[] ch1 = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch1[i] = ch[s.length()-1 - i];
            if (ch1[i]==ch2[i]){
                count++;
            }
        }

        if (count==ch.length){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
