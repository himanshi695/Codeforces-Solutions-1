import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int x=0;
        int y=0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length ; i++) {
            if (ch[i]=='A'){
                x++;
            }
            if (ch[i]=='D'){
                y++;
            }
        }
        if (x>y){
            System.out.println("Anton");
        } else if(y>x){
            System.out.println("Danik");
        } else if(x==y){
            System.out.println("Friendship");
        }
    }
}
