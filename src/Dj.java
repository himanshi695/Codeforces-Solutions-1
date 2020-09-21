import java.util.Scanner;

public class Dj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String k = s.replace("WUB"," ");
        String p = k.replace("  "," ");
        String m= p.toString();
        System.out.println(m);
    }
}
