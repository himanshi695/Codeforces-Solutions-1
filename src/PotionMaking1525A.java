import java.util.Scanner;

public class PotionMaking1525A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            int k=sc.nextInt();
            double k1=(double)k;
            double e=0;
            double w=0;
            int ans=1;
            if(k==0||k==100)
            {
                System.out.println("1");
            }else{

                e=1;
                double e1=100*e/(e+w);
                while(e1!=k1)
                {
                    if(e1<k1)
                    {
                        e++;
                    }else{
                        w++;
                    }
                    ans++;
                    e1=100*e/(e+w);
                }
                System.out.println(ans);
            }
        }
    }
}
