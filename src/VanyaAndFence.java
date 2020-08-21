import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        int width=0;
        for (int i = 0; i < n ; i++) {
            int a=sc.nextInt();
            array[i] = a;
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>h){
                width+=2;
            } else if (array[i]<=h){
                width+=1;
            }
        }
        System.out.println(width);

    }
}

