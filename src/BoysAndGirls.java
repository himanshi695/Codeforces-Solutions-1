import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class BoysAndGirls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char[] ch=s.toCharArray();
        HashSet<String> a = new HashSet<String>();
        for (int i = 0; i < ch.length ; i++) {
            a.add(String.valueOf(ch[i]));
        }
        if(a.size()%2==0){
            System.out.println("CHAT WITH HER!");
        } else{
            System.out.println("IGNORE HIM!");
        }
    }
}
