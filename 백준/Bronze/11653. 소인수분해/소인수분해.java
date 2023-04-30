import java.util.Scanner;
//소인수분해
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int f1=2;f1<=n;f1++) {
            while (n % f1 == 0) {
                System.out.printf("%d\n", f1);
                n /= f1;
            }
        }
    }
}
