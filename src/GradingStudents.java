import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int ans[]=new int[n];
        for (int i = 0; i < n ; i++) {
            int k=sc.nextInt();
            sc.nextLine();
            if (k<38){
                ans[i]=k;
            } else{
                int p=k%10;
                int q=0;
                if (p<5){

                    q=5-p;
                    if(q<3){
                    //p=p+q;
                    ans[i]=k+q;
                    } else {
                        ans[i]=k;
                    }
                } else if (p>5){
                    q=10-p;
                    //p=p+q;
                    if (q<3) {
                        ans[i] = k + q;
                    } else {
                        ans[i]=k;
                    }
                } else {
                    ans[i]=k;
                }
            }
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(ans[i]);
        }
    }
}
