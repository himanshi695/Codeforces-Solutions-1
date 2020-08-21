import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        int hard=0;
        int easy=0;
        for (int i = 0; i < n ; i++) {
            int a=sc.nextInt();
            //sc.nextLine();
            if (a==0){
                easy++;
            } else if (a==1){
                hard++;
            }
        }
        if (hard>=1){
            System.out.println("HARD");
        } else{
            System.out.println("EASY");
        }
    }
}
