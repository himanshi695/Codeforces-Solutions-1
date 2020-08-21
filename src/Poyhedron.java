import java.util.Scanner;

public class Poyhedron {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int tetrahedron = 4;
        int cube=6;
        int octahedron = 8;
        int isocahedron = 20;
        int dedecahedron = 12;
        int sum=0;
        for (int i = 0; i < n ; i++) {
                String arr = sc.nextLine();
            if (arr.equals("Tetrahedron")){
                sum=sum+tetrahedron;
            } else if (arr.equals("Cube")){
                sum=sum+cube;
            } else if(arr.equals("Octahedron")){
                sum=sum+octahedron;
            } else if (arr.equals("Dodecahedron")){
                sum=sum+dedecahedron;
            } else if(arr.equals("Icosahedron")){
                sum=sum+isocahedron;
            }
        }
        System.out.println(sum);

    }
}
