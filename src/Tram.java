import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        int b=sc.nextInt();
        sc.nextLine();
        int year=0;
        System.out.println(a + " " + b);
        while(b>=a){
            a=a*3;
            b=b*2;
            year++;
            if(a>b){
                break;
            }
        }
        System.out.println(year);
    }
}
