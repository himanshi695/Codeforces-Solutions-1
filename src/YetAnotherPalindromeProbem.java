import java.util.Scanner;

public class YetAnotherPalindromeProbem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j < n ; j++) {
                arr[j]=sc.nextInt();
            }
            boolean ok = false;
            for (int k = 0; k < n; k++)
            {
                for(int j = i + 2; j < n; j++)
                {
                    if(arr[k] == arr[j])
                        ok = true;
                }
            }
            if(ok)
                ans[i]= "YES";
            else
                ans[i]="NO";

        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
