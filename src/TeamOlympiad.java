import java.util.Scanner;
import java.util.*;
import java.awt.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int count1=0;
        int count2=0;
        int count3=0;
        int[] a= new int[n];
        for (int i = 0; i < n ; i++) {
            a[i]=sc.nextInt();
            if (a[i]==1){
                count1++;
            } else if (a[i]==2){
                count2++;
            }
            else if (a[i]==3){
                count3++;
            }
        }
        int team=0;
        if (count1<count2 && count1<count3){
            team=count1;
        } else if (count2<count1 && count2<count3){
            team=count2;
        } else{
            team=count3;
        }
        System.out.println(team);
        for (int i = 0; i < team ; i++) {
            int b=1;
            for (int j = 0; j < 3 ; j++) {
                for (int k = 0; k < a.length ; k++) {
                    if (a[k]==b){
                        System.out.print(k+1 + " ");
                        a[k]=0;
                        b++;
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
