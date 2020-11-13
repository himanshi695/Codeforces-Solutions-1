import java.util.Scanner;

public class IncreaseAndCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int sol[] = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int move = 0;
            double l=Math.sqrt(n);
            int b= (int) Math.ceil(l);
            if (b*(b-1)==n) {
                sol[i] = b - 1 + b - 2;
            }else if (b*(b-1)<n){
                sol[i]=b-1+b-1;
            } else {
                sol[i]=b-2+b-1;
            }
        }

                for (int i = 0; i < t; i++) {
                    System.out.println(sol[i]);
                }
        }
    }
