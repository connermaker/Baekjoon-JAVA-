import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t,ok = 0;
        t = sc.nextInt();
        sc.nextLine();
        boolean flag = false;
        boolean[] eng = new boolean[26];
        for(int i=0;i<t;i++){
            String word = new String();
            char prev = 0;
            word = sc.nextLine();
            for(int j=0;j<word.length();j++){
                if(prev == word.charAt(j))
                    continue;
                else {
                    prev = word.charAt(j);
                    sb.append(prev);
                }
            }
            for(int j=0;j<sb.length();j++){
                if(eng[Character.getNumericValue(sb.charAt(j))-10])
                    flag = true;
                eng[Character.getNumericValue(sb.charAt(j))-10] = true;
            }
            if(!flag)
                ok++;
            for(int j=0;j<26;j++)
                eng[j] = false;
            flag = false;
            sb.delete(0,sb.length());
        }
        System.out.println(ok);
    }
}
