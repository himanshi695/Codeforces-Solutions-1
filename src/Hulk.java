import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int a;
        String s1 = "I hate it";
        String s2= "I love it";
        String s="";
        for (int i = 1; i <=n-1; i++) {

            if (n==1){
                System.out.println(s1);
            }
            if (i%2!=0){
                String s3 = s1.replace("it","that");
                s=s+ s3 + " ";
            }
            if (i%2==0){
                String s3 = s2.replace("it","that");
                s=s+s3 + " ";
            }
        }
        if (n%2==0){
            s=s+s2;
            System.out.println(s);
        } else if (n%2!=0){
            s=s+s1;
            System.out.println(s);
        }
    }
}
