import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        int n= sc.nextInt();
        sc.nextLine();
        int w= sc.nextInt();
        sc.nextLine();
        System.out.println(k + " " + n + " " + w);
        int sum=0;
        for (int i = 1; i <= w ; i++) {
            int b=k*i;
            sum=sum+b;
        }
        int c=sum-n;
        if(c<=0){
            System.out.println("0");

        } else{
            System.out.println(c);
        }
    }
}
