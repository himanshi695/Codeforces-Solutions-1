import java.util.Scanner;

public class TheFibonacciSegment365B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        int max=0;
        int count=2;
        if (n<=2){
            System.out.println(n);
        }else{
            for (int i = 0; i < n-2 ; i++) {
                if (arr[i]+arr[i+1]==arr[i+2]){
                    count++;
                }else{
                    max=Math.max(max,count);
                    count=2;
                }
            }
            max=Math.max(max,count);
            System.out.println(max);
        }
    }
}
