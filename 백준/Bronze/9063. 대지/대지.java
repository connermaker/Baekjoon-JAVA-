import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int minx,miny;
        int maxx,maxy;
        int dump;
        long res;
        minx = miny = Integer.MAX_VALUE;
        maxx = maxy = Integer.MIN_VALUE;
        for(int f1=0;f1<t;f1++){
            dump = sc.nextInt();
            if(dump<minx)
                minx=dump;
            if(dump>maxx)
                maxx=dump;
            dump = sc.nextInt();
            if(dump<miny)
                miny=dump;
            if(dump>maxy)
                maxy=dump;
        }
        res = (maxx-minx)*(maxy-miny);
        System.out.println(res);
    }
}
