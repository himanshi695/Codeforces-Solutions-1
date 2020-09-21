import java.util.Scanner;

public class CoverPoints1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int reult=0;
        int sum=0;
        int[] arr=new int[t];
        for (int i = 0; i < t ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            sum=a+b;
            arr[i]=sum;
        }
        int max=arr[0];
        for (int i = 0; i < t ; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
