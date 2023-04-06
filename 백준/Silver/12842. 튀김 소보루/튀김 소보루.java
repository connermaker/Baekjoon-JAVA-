import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,s,m,bnum = -1;
        n = sc.nextInt();
        s = sc.nextInt();
        m = sc.nextInt();
        int[] et = new int[m];
        int[] person = new int[m];
        for(int i=0;i<m;i++){
            person[i] = sc.nextInt();
            et[i] = 0;
        }
        while(true){
            for(int i=0;i<m;i++){
                if(et[i]==0){
                    n--;
                    if(n==s){
                        bnum = i;
                        break;
                    }
                    et[i] = person[i];
                }
                et[i]--;
            }
            if(bnum != -1){
                break;
            }
        }
        System.out.println(bnum+1);
    }
}
