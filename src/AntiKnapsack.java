import java.util.Scanner;

public class AntiKnapsack {
    public static void solve(int n, int k){
        System.out.println(n-(k+1)/2 + " ");
        for(int i=k+1;i<=n;i++){
            System.out.print(i + " ");
        }
        for (int i = (k+1)/2; i < k ; i++) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt(); int k=sc.nextInt();
            sc.nextLine();
            solve(n,k);
        }
    }
}
