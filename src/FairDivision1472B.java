import java.util.Scanner;

public class FairDivision1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        //sc.nextInt();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int arr[] = new int[n];
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }
            if ((count2*2+count1)%2!=0){
                ans[i]="NO";
            } else{
                int k=(count2*2+count1)/2;
                if (k%2==0 || (k%2==1 && count1!=0)){
                    ans[i]="YES";
                } else{
                    ans[i]="NO";
                }
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
