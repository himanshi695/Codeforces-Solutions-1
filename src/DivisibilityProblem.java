import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int ans[]=new int[t];
        for (int i = 0; i < t ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            if(a%b==0){
                ans[i]=0;
            }
            else if (a==b){
                ans[i]=0;
            } else if (a<b){
                ans[i]=b-a;
            } else{
                ans[i]=b-(a%b);
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}

