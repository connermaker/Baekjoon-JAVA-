import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeng = new String();
        int a = 0;
        numeng = sc.nextLine();
        numeng = numeng.toUpperCase();
        for(int i=0;i<numeng.length();i++){
            char dump = numeng.charAt(i);
            if(dump >='Z')
                dump-=2;
            else if (dump >= 'S')
                dump--;
            a += (dump-'A')/3;
            a += 3;
        }
        System.out.println(a);
    }
}
