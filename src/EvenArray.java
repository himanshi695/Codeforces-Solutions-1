import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int count=0;
        int[] p = new int[t];
        for (int i = 0; i < t ; i++) {
            int n=sc.nextInt();
            sc.nextLine();
            int[] a = new int[n];
            for (int j = 0; j < n ; j++) {
                a[j]= sc.nextInt();
            }
            int c=0;
            int d=0;
            for (int j = 0; j < a.length ; j++) {
                if (a[j]%2!=j%2){
                    if(a[j]%2==1){
                        c++;    
                    } else{
                        d++;
                    }
                }
            }
            if (c==d){
                p[i]=c;
            } else{
                p[i]=-1;
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(p[i]);
        }
    }

}
