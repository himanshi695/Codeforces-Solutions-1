import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[] = new String[t];
        for (int i = 0; i < t ; i++) {
            int x=sc.nextInt();
            sc.nextLine();
            if (x<10){
                ans[i]= String.valueOf(x);
            }else if(x>=10 && x<18){
                for (int j = 1; j <=8 ; j++) {
                    if (j+9==x){
                        ans[i]=j+"9";
                    }
                }
            } else if (x>= 18 && x<25) {
                for (int j = 1; j <=7 ; j++) {
                    if (j+8+9==x){
                        ans[i]=j+"89";
                    }
                }
            } else if (x>=25 && x<31) {
                for (int j = 1; j <=6 ; j++) {
                    if (j+7+8+9==x){
                        ans[i]=j+"789";
                    }
                }
            } else if (x>=31 && x<36) {
                for (int j = 1; j <=5 ; j++) {
                    if (j+6+7+8+9==x){
                        ans[i]=j+"6789";
                    }
                }
            } else if (x>=36 && x<40) {
                for (int j = 1; j <=4 ; j++) {
                    if (j+5+6+7+8+9==x){
                        ans[i]=j+"56789";
                    }
                }
            } else if (x>=40 && x<43) {
                for (int j = 1; j <=3 ; j++) {
                    if (j+4+5+6+7+8+9==x){
                        ans[i]=j+"456789";
                    }
                }
            } else if (x>=43 && x<45) {
                for (int j = 1; j <=2 ; j++) {
                    if (j+3+4+5+6+7+8+9==x){
                        ans[i]=j+"3456789";
                    }
                }
            } else if (x==45){
                ans[i]="123456789";
            } else if (x>45) {
                ans[i]="-1";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
