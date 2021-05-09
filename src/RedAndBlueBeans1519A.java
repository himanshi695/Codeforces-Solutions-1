import java.util.Scanner;

public class RedAndBlueBeans1519A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            long r=sc.nextInt(); long b=sc.nextInt(); long d=sc.nextInt();
            sc.nextLine();
            long min=Math.min(r,b);
            long temp=(1+d)*min;
            if (Math.max(r,b)>temp){
                ans[i]="NO";
            } else{
                ans[i]="YES";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
