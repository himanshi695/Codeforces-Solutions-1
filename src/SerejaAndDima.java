import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] k=new int[n];
        for (int i = 0; i < n ; i++) {
            k[i]=sc.nextInt();
        }
        Arrays.sort(k);
        int sereja=0;
        int dima=0;
        if (n%2==0){
            for (int i = 0; i < n ; i++) {
                if (i%2==0){
                    dima=dima+k[i];
                } else{
                    sereja=sereja+k[i];
                }
            }
        } else {
            for (int i = 0; i <n ; i++) {
                if (i%2==0){
                    sereja=sereja+k[i];
                } else{
                    dima=dima+k[i];
                }
            }
        }
        System.out.println(sereja + " " + dima);
    }
}
