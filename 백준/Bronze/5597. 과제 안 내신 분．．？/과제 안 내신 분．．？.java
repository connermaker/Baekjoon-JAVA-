import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] stu = new boolean[30];
        int dump;
        for(int i=0;i<30;i++)
            stu[i] = false;
        for(int i=0;i<28;i++){
            dump = sc.nextInt();
            stu[dump-1] = true;
        }
        for(int i=0;i<30;i++) {
            if(!stu[i])
                System.out.println(i+1);
        }
    }
}
