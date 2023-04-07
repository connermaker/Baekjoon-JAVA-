import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] eng = new int[26];
        for(int i=0;i<26;i++)
            eng[i] = -1;
        String word = new String();
        word = sc.nextLine();
        for(int i=0;i<word.length();i++){
            int dump = word.charAt(i)-'a';
            if(eng[dump]!=-1)
                continue;
            eng[dump]=i;
        }
        for(int i=0;i<26;i++)
            System.out.printf("%d ",eng[i]);
    }
}
