import javafx.scene.effect.Blend;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class HelpMaths {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] n = new int[(s.length()/2)+1];
        char[] ch = s.toCharArray();
        int index=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!='+'){
                n[index] =  Character.getNumericValue(ch[i]);
                index++;
            }
        }
        Arrays.sort(n);
        for (int i = 0; i < n.length-1; i++) {
            System.out.print(n[i] + "+");
        }
        System.out.print(n[n.length-1]);

    }
}
