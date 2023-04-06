import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        b += c % 60;
        if(b>=60){
            b -= 60;
            a++;
        }
        a = (a + (c / 60)) % 24;
        System.out.printf("%d %d",a,b);
    }
}
