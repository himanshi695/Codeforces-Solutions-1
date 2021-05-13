import java.util.Arrays;
import java.util.Scanner;

public class MorningJogging1517B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            int n=sc.nextInt(); int m=sc.nextInt();
            sc.nextLine();
            int l[][]=new int[n][m];
            for(int i=0;i<n;i++) {
                for (int j = 0; j < m; j++) {
                    l[i][j] = sc.nextInt();
                }
            }
            sortRowWise(l);
            for(int j=0;j<m;j++)
            {
                int min=l[0][j];
                int ind=0;
                for(int i=0;i<n;i++)
                {
                    if(l[i][j]<min)
                    {
                        min=l[i][j];
                        ind=i;
                    }
                }
                for(int i=0;i<n;i++)
                {
                    if(i==ind)
                        continue;
                    for(int k=j;k<m-1;k++)
                    {
                        int temp=l[i][m-1];
                        l[i][m-1]=l[i][k];
                        l[i][k]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++) {
                    System.out.print(l[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    private static int sortRowWise(int[][] l) {
        for (int i = 0; i < l.length; i++)
            Arrays.sort(l[i]);

        return 0;
    }
}
