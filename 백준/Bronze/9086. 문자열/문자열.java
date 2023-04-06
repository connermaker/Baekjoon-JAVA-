import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        String s = new String();
        t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            s = sc.nextLine();
            System.out.printf("%s%s\n",s.charAt(0),s.charAt(s.length()-1));
        }
    }
}
