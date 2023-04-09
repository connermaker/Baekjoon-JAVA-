import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] wall = new boolean[100][100];
        int t,x,y;
        int total = 0;
        t = sc.nextInt();
        for(int i=0;i<t;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            for(int f1=y;f1<y+10;f1++)
                for(int f2=x;f2<x+10;f2++)
                    wall[f1][f2] = true;
        }
        for(int f1=0;f1<100;f1++)
            for(int f2=0;f2<100;f2++)
                if(wall[f1][f2])
                    total++;
        System.out.println(total);
    }
}
