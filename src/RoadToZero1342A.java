import java.util.Scanner;

public class RoadToZero1342A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        long ans[]=new long[t];
        for (int i = 0; i < t ; i++) {
            long count=0;
            long x=sc.nextInt(); long y=sc.nextInt();
            long a=sc.nextInt(); long b=sc.nextInt();
            if(2*a>b){
                long min=Math.min(x,y);
                x-=min;
                y-=min;
                count+=min;
            }
            count=count*b;
            count+=(x+y)*a;
            ans[i]=count;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
