import java.util.Scanner;

public class Prefixes {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int count=0;
        char ch[]=s.toCharArray();
        for (int i = 0; i < n ; i=i+2) {
            if (s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='a'){
                count++;
                ch[i+1]='b';
            } else if (s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='b'){
                count++;
                ch[i+1]='a';
            }
        }
        System.out.println(count);
        System.out.println(String.valueOf(ch));
    }
}
