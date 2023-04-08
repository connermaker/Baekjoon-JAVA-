import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = new String();
        word = sc.nextLine();
        int[] eng = new int[26];
        int max = -1;
        int maxind = -1;
        boolean flag = false;
        for(int i=0;i<word.length();i++)
            eng[Character.getNumericValue(word.charAt(i))-10]++;
        for(int i=0;i<26;i++){
            if(eng[i]>max){
                maxind=i;
                max = eng[i];
                flag =false;
            } else if (eng[i]==max)
                flag = true;
        }
        if(flag)
            System.out.println("?");
        else
            System.out.println((char)(maxind+'A'));
    }
}
