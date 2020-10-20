import java.util.Scanner;

public class XeniaAndRingroad339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); int m=sc.nextInt();
        sc.nextLine();
        long arr[]=new long[m];
        for (int i = 0; i < m ; i++) {
            arr[i]=sc.nextInt();
        }
        long count=arr[0]-1;
        for (int i = 1; i <m ; i++) {
            if (arr[i]<arr[i-1]){
                count+=(n-arr[i-1])+arr[i];
            } else if (arr[i]>arr[i-1]){
                count+=(arr[i]-arr[i-1]);
            } else {
                count+=0;
            }
        }
        System.out.println(count);
    }
}
