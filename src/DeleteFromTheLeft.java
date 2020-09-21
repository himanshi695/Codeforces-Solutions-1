import java.util.Scanner;

public class DeleteFromTheLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int count=0;
        int ans=0;
        int j=0;
        int i = 0;
        for (i=a.length()-1,j=b.length()-1 ; i >=0 ; i--,j--) {
            if (j>=0){
                if (a.charAt(i)!=b.charAt(j)){
                    count=i+1+j+1;
                    ans=1;
                    break;
                }
            } else {
                break;
            }

        }
        if (ans==1){
            System.out.println(count);
        } else if (i>=0){
            System.out.println(i+1);
        } else if (j>=0){
            System.out.println(j+1);
        } else {
            System.out.println("0");
        }
    }
}
