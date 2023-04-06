import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordcount;
        int diff = 0, adiff = 0;
        boolean flag = false;
        String dump;
        dump = sc.nextLine();
        wordcount = Integer.parseInt(dump);
        String[] words = new String[wordcount];
        int[][] argcount = new int[wordcount][26];
        for(int i=0;i<wordcount;i++){
            words[i] = sc.nextLine();
        }
        for(int i=0;i<wordcount;i++){
            for(int j=0;j<words[i].length();j++){
                argcount[i][Character.getNumericValue(words[i].charAt(j))-10]++;
            }
        }
        for(int i=1;i<wordcount;i++){
            flag = false;
            diff = 0;
            for(int j=0;j<26;j++){
                diff += Math.abs(argcount[0][j] - argcount[i][j]);
            }
            if (diff == 0 || diff == 1||(words[0].length()==words[i].length()&&diff==2)) {
                adiff++;
            }
        }
        System.out.println(adiff);
    }
}
