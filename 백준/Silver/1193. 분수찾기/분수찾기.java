import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,che = 0;
        int count = 1;
        x = sc.nextInt();
        while(x>che){
            x -= che;
            count++;
            che++;
        }
        if((count)%2 == 0)
            System.out.printf("%d/%d\n",count-x,x);
        else
            System.out.printf("%d/%d\n",x,count-x);
    }
}
