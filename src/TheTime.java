import java.util.Scanner;

public class TheTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a=sc.nextInt();
        sc.nextLine();
        String o = String.valueOf(s.charAt(0));
        String n = String.valueOf(s.charAt(1));
        String k=o.concat(n);
        int l= Integer.parseInt(k);
        String x= String.valueOf(s.charAt(3));
        String y= String.valueOf(s.charAt(4));
        String m= x.concat(y);
        int w= Integer.parseInt(m);
        int res=(l*60+w+a)%1440;
        String form = String.format("%02d" + ":" + "%02d",res/60,res%60);
        System.out.println(form);

    }
}
