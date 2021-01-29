import java.util.Scanner;

public class HighSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(); int y=sc.nextInt();
        sc.nextLine();
        double k=  (y*Math.log10(x));
        double l=  (x*Math.log10(y));
        if (k>l){
            System.out.println(">");
        } else if (k<l){
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}
