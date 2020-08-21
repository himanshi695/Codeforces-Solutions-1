import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.nextLine();
        int a,b,c,d,count=0;
        while (y>0){
            y++;
            a=y/1000;
            b=(y%1000)%10;
            c=((y%1000)%100)/10;
            d=(y%1000)/100;
            if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                System.out.println(y);
                break;
            }
        }

    }
}
