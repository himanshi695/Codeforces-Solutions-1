import java.util.Scanner;

public class SpaceNavigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String ans[]=new String[t];
        for (int i = 0; i < t ; i++) {
            int px=sc.nextInt(); int py=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int countu=0;
            int countd=0;
            int countr=0;
            int countl=0;
            for (int j = 0; j < s.length() ; j++) {
                if (s.charAt(j)=='U'){
                    countu++;
                } else if (s.charAt(j)=='D'){
                    countd++;
                } else if (s.charAt(j)=='R'){
                    countr++;
                } else{
                    countl++;
                }
            }
            boolean x=false;
            boolean y=false;
            if (px<0){
                if (Math.abs(px)<=countl){
                    x=true;
                }
            } else if (px>=0){
                if (px<=countr){
                    x=true;
                }
            }
            if (py<0){
                if (Math.abs(py)<=countd){
                    y=true;
                }
            } else if (py>=0){
                if (py<=countu){
                    y=true;
                }
            }
            if (x == true && y==true){
                ans[i]="YES";
            } else{
                ans[i]="NO";
            }
        }
        for (int i = 0; i < t ; i++) {
            System.out.println(ans[i]);
        }
    }
}
