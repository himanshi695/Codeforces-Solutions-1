import java.util.Scanner;

public class Timofey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l=0;
        int h=n-1;
        if (n%2!=0){
            for (int i = 0; i < (n/2) ; i++) {
                if (i%2==0){
                    swap(a,l,h);
                    l=l+2;
                    h=h-2;
                }
            }
        } else {
            for (int i = 0; i <= (n/2)-1 ; i++) {
                if (i%2==0){
                    swap(a,l,h);
                    l=l+2;
                    h=h-2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void swap(int arr[],int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }

}
