import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = new String();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        word = sc.nextLine();
        for(int i=word.length()-1;i>=0;i--)
            sb.append(word.charAt(i));
        String dump = new String();
        dump = sb.toString();
        for(int i=0;i<word.length();i++)
            if(dump.charAt(i)!=word.charAt(i))
                flag = true;
        if (flag)
            System.out.println(0);
        else
            System.out.println(1);
    }
}
