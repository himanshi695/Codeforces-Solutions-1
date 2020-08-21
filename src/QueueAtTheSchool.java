import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char temp;
        char[] ch = s.toCharArray();
        for (int i = 0; i < t ; i++) {
            int a=0;
            while(a<ch.length-1){
                if(ch[a]=='B' && ch[a+1]=='G'){
                    temp=ch[a+1];
                    ch[a+1]=ch[a];
                    ch[a]=temp;
                    a=a+2;
                } else {
                    a=a+1;
                }
            }

        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
