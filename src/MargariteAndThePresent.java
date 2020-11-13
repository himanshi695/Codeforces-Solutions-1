import java.util.Scanner;

public class MargariteAndThePresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int sol[]=new int[t];
        for (int i = 0; i < t ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            int sum=0;
            for (int j = a; j <=b  ; j++) {
                if (j%2==0){
                    sum+=j;
                } else {
                    sum+=(j*(-1));
                }
            }
            sol[i]=sum;
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(sol[i]);
        }

    }
}
