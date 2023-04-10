import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n,check=1;
        int pass = 1;
        n = sc.nextLong();
        while(check<n){
            check +=6*pass;
            pass++;
        }
        System.out.println(pass);
    }
}
