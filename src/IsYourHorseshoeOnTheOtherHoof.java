import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < 4 ; i++) {
          array[i] = sc.nextInt();
          a.add(array[i]);
        }
        if (a.size()<4){
            System.out.println(4-a.size());
        } else{
            System.out.println("0");
        }

    }
}
