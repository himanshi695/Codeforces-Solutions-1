import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] ch = new int[n];
        for (int i = 0; i < n; i++) {
            ch[i] = sc.nextInt();
            sc.nextLine();
        }
        int count=1;
        for (int i = 0; i < ch.length-1 ; i++) {
            if (ch[i]==ch[i+1]){
                continue;
            } else if(ch[i]!=ch[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
