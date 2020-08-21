import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashSet<Integer> b= new HashSet<Integer>();
        int p=sc.nextInt();
        for (int i = 0; i < p ; i++) {
            int a=sc.nextInt();
            b.add(a);
        }
        int q=sc.nextInt();
        for (int i = 0; i < q ; i++) {
            int c=sc.nextInt();
            b.add(c);
        }
        if (b.size()==n){
            System.out.println("I become the guy.");
        } else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
