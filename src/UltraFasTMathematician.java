import java.util.Scanner;

public class UltraFasTMathematician {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
        char[] ch1= a.toCharArray();
        char[] ch2= b.toCharArray();
        char temp;
        char[] ch3 = new char[ch1.length];
        for (int i = 0; i < ch1.length ; i++) {
            if (ch1[i]!=ch2[i]){
                temp= '1';
                ch3[i] = temp;
            } else if (ch1[i]==ch2[i]){
                temp='0';
                ch3[i] = temp;
            }
        }
        for (int i = 0; i < ch3.length; i++) {
            System.out.print(ch3[i]);
        }
    }
}

