import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c,n;
        c = sc.nextInt();
        for(int i=0;i<c;i++){
            n = sc.nextInt();
            int[] num = new int[n];
            double avg = 0;
            int abo_avg = 0;
            for(int j=0;j<n;j++){
                num[j] = sc.nextInt();
                avg += num[j];
            }
            avg /= n;
            for(int j=0;j<n;j++){
                if(num[j]>avg)
                    abo_avg++;
            }
            System.out.printf("%.3f%%\n",(double)abo_avg/n*100);
        }

    }
}
