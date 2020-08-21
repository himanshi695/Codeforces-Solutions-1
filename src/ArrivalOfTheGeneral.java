import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) throws PortUnreachableException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();
        }
        int index1 = 0,index2 = 0;
        int max=array[0];
        int min=array[0];
        for (int i = 0; i < n ; i++) {
            if (array[i]>max){
                max=array[i];
                index1=i;
            }
            if (array[i]<=min){
                min=array[i];
                index2=i;
            }
        }

        if (index2<index1){
            index2=(n-1)-index2;
            System.out.println(index2+index1-1);
        } else {
            index2=(n-1)-index2;
            System.out.println(index2+index1);
        }

    }
}
//10 10 58 31 63 40 76