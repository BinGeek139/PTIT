package PTIT_Practice;
import java.util.Scanner;

public class P201PROH {
   private static final Scanner reader = new Scanner(System.in);
    private  static long check;
    public static void main(String[] args) {
        long T = reader.nextLong();
        for (long t = 1; t <= T; t++) {
            long A = reader.nextLong();
            long B = reader.nextLong();
            check=A;
            String result=tryHard(A,B) ? "YES" : "NO";
            System.out.println(result);

        }
    }
    public  static boolean tryHard(long a,long b){
        if(a>=b ) return true;
        if(a <=1 ){
            return false;
        } else {

            if(a%2==1){
                return ((a-1) != check) && tryHard(a-1,b);
            }else {
                return ((a*3)/2 != check)&& (tryHard(a*3/2,b));
            }
        }

    }
}
