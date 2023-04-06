import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,max = 0;
        double result = 0;
        n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
            if(max<num[i])
                max = num[i];
        }
        for(int i=0;i<n;i++)
            result += ((double)num[i]/max)*100;
        result /= n;
        System.out.printf("%.6f\n",result);
    }
}
