import java.util.Scanner;

public class FafaAndTheGates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int count=0;
        if (s.length() == 1) {
            System.out.println("0");
        } else {
            int x=0;
            int y=0;
            for (int i = 0; i < n-1 ; i++) {
                if (s.charAt(i)=='R'){
                  x++;
                }
                if (s.charAt(i)=='U'){
                    y++;
                }
                if (x==y && x!=0 && y!=0){
                    if (s.charAt(i)=='R' && s.charAt(i+1)=='R'){
                        count++;
                    } else if (s.charAt(i)=='U' && s.charAt(i+1)=='U'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        //System.out.println(count);
    }
}
