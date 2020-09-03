import java.util.Arrays;
import java.util.Scanner;

public class ThreePairwiseMaximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int[] k=new int[3];
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            sc.nextLine();
            k[0]=x;
            k[1]=y;
            k[2]=z;
            Arrays.sort(k);
            if (k[1]==k[2]){
                System.out.println("YES");
                if (k[0]==k[1] && k[0]==k[2] && k[1]==k[2]){
                    System.out.print(k[0] + " " + k[1] + " " + k[2]);
                } else {
                    System.out.print(k[0] + " " + k[1] + " ");
                    if (k[0] == 1) {
                        System.out.print("1");
                    } else {
                        System.out.print(k[0] - 1);
                    }
                }
            } else{
                System.out.println("NO");
            }
        }
    }
}
