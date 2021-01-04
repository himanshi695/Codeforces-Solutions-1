import java.util.Scanner;

public class Square1351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[t];
        for (int i = 0; i < t ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            int c=sc.nextInt();
            int d=sc.nextInt();
            sc.nextLine();
            boolean ans=Math.min(a,b)+ Math.min(c,d)==Math.max(a,b) && Math.max(a,b)==Math.max(c,d);
            if (ans){
                arr[i]="YES";
            } else{
                arr[i]="NO";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(arr[i]);
        }
    }
}
