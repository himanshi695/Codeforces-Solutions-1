import java.util.Scanner;

public class SpyDetected1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < n ; j++) {
                arr[j]=sc.nextInt();
            }
            int element=0;
            if (arr[0]!=arr[1] && arr[1]==arr[2]){
                ans[i]=1;
            } else if (arr[0]!=arr[1] && arr[0]==arr[2]){
                ans[i]=2;
            } else if (arr[0]==arr[1] && arr[1]!=arr[2]){
                ans[i]=3;
            } else {
                element=arr[0];
                for (int j = 3; j < arr.length ; j++) {
                    if (arr[j]!=element){
                        ans[i]=j+1;
                        break;
                    }
                }
            }

        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
