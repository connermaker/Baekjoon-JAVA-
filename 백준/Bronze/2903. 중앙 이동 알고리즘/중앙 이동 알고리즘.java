import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sqw = 1;
        n = sc.nextInt();
        for(int i=0;i<n;i++)
            sqw *= 2;
        sqw++;
        System.out.println(sqw*sqw);
    }
}
