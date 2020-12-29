import java.util.Scanner;

public class FancyFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for (int i = 0; i < n ; i++) {
            double angle=sc.nextInt();
            sc.nextLine();
            if (360%(180-angle)==0){
                arr[i]="YES";
            } else {
                arr[i]="NO";
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
