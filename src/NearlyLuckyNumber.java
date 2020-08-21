import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n= sc.nextLong();
        sc.nextLine();
        String s= String.valueOf(n);
        char[] ch= s.toCharArray();

        int count=0;
        for (int i = 0; i < ch.length ; i++) {
            if (ch[i]=='7' || ch[i]=='4'){
                count++;
            }

        }
        if(count==4 || count==7){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
