import java.util.Scanner;

public class EncodingB {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char[] ch1=s.toCharArray();
        char[] ch2=new char[n];
        if (n%2!=0){
            int p=(n/2);
            int o=(n/2);
            ch2[(n/2)]=ch1[0];
            for (int i = 1; i < ch1.length ; i++) {
                if (i%2!=0){
                    p=p-1;
                    ch2[p]=ch1[i];
                } else{
                    o=o+1;
                    ch2[o]=ch1[i];
                }
            }
        } else {
            int p=(n/2)-1;
            int o=(n/2)-1;
            ch2[(n/2)-1]=ch1[0];
            for (int i = 1; i < ch1.length  ; i++) {
                if (i%2!=0){
                    p=p+1;
                    ch2[p]=ch1[i];
                } else{
                    o=o-1;
                    ch2[o]=ch1[i];
                }
            }
        }
        for (int i = 0; i < ch2.length ; i++) {
            System.out.print(ch2[i]);
        }
    }
}
