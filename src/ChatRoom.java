import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String ss="hello";
        int a=0,b=0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i)==ss.charAt(a)){
                a++;
                b++;
            }
            if (b==5){
                break;
            }
        }
        if (b==5){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
