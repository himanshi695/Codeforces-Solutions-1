import java.util.Scanner;

public class UniversityClasses847G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String ss[][]=new String[n][7];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 7 ; j++) {
                ss[i][j]=sc.nextLine();
            }
        }
        int ans=0;
        for (int i = 0; i < 7 ; i++) {
            int count=0;
            for (int j = 0; j < n ; j++) {
                if (ss[j][i]=="1"){
                    count++;
                }
            }
            ans=Math.max(ans,count);
        }
        System.out.println(ans);

    }
}
