import java.util.Scanner;
public class BlackSquare {

      public static void main(String[] args)
        {
            Scanner z=new Scanner(System.in);
            int arr[]={z.nextInt(),z.nextInt(),z.nextInt(),z.nextInt()};
            String s=z.next();
            int cal=0;
            for(int i=0;i<s.length();i++)
            {
                if(Character.getNumericValue(s.charAt(i))==1)
                    cal+=arr[0];
                else if(Character.getNumericValue(s.charAt(i))==2)
                    cal+=arr[1];
                else if(Character.getNumericValue(s.charAt(i))==3)
                    cal+=arr[2];
                else if(Character.getNumericValue(s.charAt(i))==4)
                    cal+=arr[3];
            }
            System.out.println(cal);
        }

}
