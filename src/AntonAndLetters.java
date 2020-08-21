import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) throws Exception{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        //InputStreamReader r=new InputStreamReader(System.in);
        //     BufferedReader br=new BufferedReader(r);
        //try {
            input = br.readLine();
        //} catch (IOException e) {
        //    System.out.print(e);
        //}

        if (input.charAt(1) == '}') {
            System.out.println(0);
            return;
        }
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 1; i <= input.length(); i = i + 3) {
            set.add(input.charAt(i));
        }
        System.out.println(set.size());
    }
    }

