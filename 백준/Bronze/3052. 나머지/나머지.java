import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean flag = false;
        int[] a = new int[10];
        int[] b = new int[10];
        for(int i=0;i<10;i++){
            a[i] = sc.nextInt();
            a[i] = a[i] % 42;
            b[i] = -1;
        }
        for(int i=0;i<10;i++){
            flag = false;
            for(int j=0;j<count;j++)
                if(b[j]==a[i])
                    flag = true;
            if(!flag){
                b[count]=a[i];
                count++;
            }
        }
        System.out.printf("%d",count);
    }
}
