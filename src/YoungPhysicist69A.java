import java.util.Scanner;

public class YoungPhysicist69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int arr[][]=new int[n][3];
        int a=0, b=0,c=0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 3 ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n ; i++) {
            a+=arr[i][0];
            b+=arr[i][1];
            c+=arr[i][2];
        }
        if (a==0 && b==0 && c==0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
