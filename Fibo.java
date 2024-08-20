import java.util.Scanner;
public class Fibo {
    
    public static int fb(int i) {
        if ( i == 0 ) return 0;
        else if (i == 1) return 1;
        else return (fb(i-1)+fb(i-2));
    }
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to get the corrosponding nth term in Fibonacci Series\n=> ");
        int i = inp.nextInt();inp.close();
        System.out.println(fb(i-1));
    }
}
