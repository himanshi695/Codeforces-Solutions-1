import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch =s.toCharArray();
        int x=0;
        int y=0;
        for (int i = 0; i < ch.length ; i++) {
            if (Character.isUpperCase(ch[i])){
                x++;
            }
            if (Character.isLowerCase(ch[i])){
                y++;
            }
        }
        if (x>y){
            System.out.println(s.toUpperCase());
        } else if (y>x){
            System.out.println(s.toLowerCase());
        } else if(x==y){
            System.out.println(s.toLowerCase());
        }
    }
}
