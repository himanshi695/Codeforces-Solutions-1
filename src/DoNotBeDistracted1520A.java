import java.util.Scanner;

public class DoNotBeDistracted1520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            char ch[]=s.toCharArray();
            int arr[]=new int[26];
            boolean flag=true;
            for (int j = 0; j < s.length()-1 ; j++) {
                if (ch[j]!=ch[j+1]){
                    if (arr[ch[j]-65]==-1)
                    {
                        flag=false;
                        break;
                    }
                    arr[ch[j]-65]=-1;
                }
            }
            if (arr[ch[n-1]-65]==-1){
                flag=false;
            }
            if (flag){
                ans[i]="YES";
            } else{
                ans[i]="NO";
            }
        }
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}
