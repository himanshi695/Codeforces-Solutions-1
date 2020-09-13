import java.util.Scanner;

public class MakeProductEqualOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        long[] arr=new long[n];
        int count1=0,countZero=0;
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextLong();
            if (arr[i]<0){
                count1++;
            }
            if(arr[i] == 0){
                countZero++;
            }
        }
        long product=0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < -1){
                product+=(java.lang.Math.abs(arr[i])-1);
            }
            if(arr[i] > 1){
                product+=(arr[i]-1);
            }
        }
        if(countZero == 0){
            if(count1%2 == 1){
                product+=2;
            }
        }else{
            if(count1%2 == 1){
                product+=1;
                countZero--;
            }
        }
        product+=countZero;
        System.out.println(product);
    }
}