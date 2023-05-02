import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,w,h;
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        int resx,resy;
        resx = w-x;
        resy = h-y;
        if(resx>x){
            resx = x;
        }
        if(resy > y){
            resy = y;
        }
        if(resy>resx){
            System.out.println(resx);
        }
        else {
            System.out.println(resy);
        }
    }
}