import java.util.Scanner;

public class KshushaTheSquirrel299B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt(); int k=sc.nextInt();
        sc.nextLine();
        String m=sc.nextLine();
        char arr[]=m.toCharArray();
        int i=0;
        while (true){
            if (arr[i]=='.'){
                if (i==n-1 && arr[i]=='.'){
                    System.out.println("YES");
                    break;
                }
                i++;
                //continue;
            } else if (arr[i]=='#'){
                if (arr[(i-1+k)]=='#'){
                    System.out.println("NO");
                    break;
                } else {
                    i= (i-1+k);
                }
            }
        }
    }
}
