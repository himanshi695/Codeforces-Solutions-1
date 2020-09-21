import javafx.scene.transform.Scale;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        int[] newArr = new int[n];
        int[] arr=new int[(n/2)+1];
        int[] arr1=new int[(n/2)+1];
        for (int i = 0; i < n ; i++) {
            if ((i+1)%2!=0){
                arr[i]=i+1;
            }
        }
        for (int i = 0; i < n ; i++) {
            if ((i+1)%2==0){
                arr1[i]=i+1;
            }
        }
        for (int i = 0; i < n/2 ; i++) {
            newArr[i]=arr[i];
        }
        for (int i = n/2 ; i < n ; i++) {
            newArr[i]=arr1[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            if (i==k){
                System.out.println(newArr[i-1]);
                break;
            }
        }

    }
}
