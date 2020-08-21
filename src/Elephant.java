import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int a=x/5;
        int b=x%5;
        if(b==4){
            a=a+1;
        }else if(b==3){
            a=a+1;
        } else if(b==2){
            a=a+1;
        } else if( b==1){
            a=a+1;
        } else{
            a=a+0;
        }
        System.out.println(a);
    }
}
