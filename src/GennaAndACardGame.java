import java.util.Scanner;

public class GennaAndACardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        String[] k = new String[5];
        int count=0;
        for (int i = 0; i < 5 ; i++) {
            k[i] = sc.nextLine();
            if (k[i].charAt(0)==a.charAt(0) || k[i].charAt(1)==a.charAt(1)){
                count++;
            }
        }
        System.out.println(count);
        if (count>0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
