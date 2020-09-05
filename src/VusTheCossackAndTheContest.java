import java.util.Scanner;

public class VusTheCossackAndTheContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        if (m>=n && k>=n){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
