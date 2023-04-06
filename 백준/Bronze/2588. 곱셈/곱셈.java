import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int odernum1,odernum10,odernum100;
        int res;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        odernum100 = num2 / 100;
        odernum10 = (num2 % 100) / 10;
        odernum1 = num2 % 10;
        odernum1 *= num1;
        odernum10 *= num1;
        odernum100 *= num1;
        System.out.println(odernum1);
        System.out.println(odernum10);
        System.out.println(odernum100);
        System.out.println(odernum100*100+odernum10*10+odernum1);
    }
}
