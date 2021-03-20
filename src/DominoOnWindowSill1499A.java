import java.util.*;
public class DominoOnWindowSill1499A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String ans[]=new String[t];
        for(int i=0; i<t;i++){
            int n=sc.nextInt(); int k1=sc.nextInt(); int k2=sc.nextInt();
            int w=sc.nextInt(); int b=sc.nextInt();
            if((k1+k2<2*w) ||(2*n-k1-k2<2*b)){
                ans[i]="No";
            } else{
                ans[i]="Yes";
            }
        }
        for(int i=0;i<t;i++){
            System.out.println(ans[i]);
        }
    }
}
