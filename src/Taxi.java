import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //sc.nextLine();
        int arr[]=new int[n];
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1) {
                count1++;
            } else if (arr[i]==2){
                count2++;
            } else if (arr[i]==3){
                count3++;
            } else {
                count4++;
            }
        }
        count1=Math.max(count1-count3,0);
        int ans=count4+count3 + (count1*1 + count2*2 + 3)/4;
        System.out.println(ans);
    }
}
