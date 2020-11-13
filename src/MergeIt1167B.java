import java.util.Scanner;

public class MergeIt1167B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        long ans[]=new long[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            long arr[]=new long[n];
            long count=0;
            long a=0;
            long b=0;
            for (int j = 0; j < n ; j++) {
                arr[j]=sc.nextInt();
                if (arr[j]%3==0){
                    count++;
                } else if (arr[j]%3==1){
                    a++;
                } else if (arr[j]%3==2){
                    b++;
                }
            }
            long min=Math.min(a,b);
            count=count+min;
            a=a-min;
            b=b-min;
            if (a>0){
                count+=a/3;
            } else if (b>0){
                count+=b/3;
            }
            ans[i]=count;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
