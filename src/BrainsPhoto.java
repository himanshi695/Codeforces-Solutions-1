import java.util.Scanner;

public class BrainsPhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String[][] s = new String[n][m];
        //sc.nextLine();
        int count=0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                s[i][j]=sc.next();
            }
            //System.out.println();
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                if (s[i][j].equals("C") || s[i][j].equals("Y") || s[i][j].equals("M")){
                    count++;
                }
            }
        }
        //System.out.println(count);
        if (count==0){
            System.out.println("#Black&White");
        } else{
            System.out.println("#Color");
        }
    }
}
