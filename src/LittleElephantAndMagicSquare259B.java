import java.util.Scanner;

public class LittleElephantAndMagicSquare259B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        int sum=0;
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        sum=sum/2;
        arr[0][0]=sum-arr[0][1]-arr[0][2];
        arr[1][1]=sum-arr[1][0]-arr[1][2];
        arr[2][2]=sum-arr[2][0]-arr[2][1];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
