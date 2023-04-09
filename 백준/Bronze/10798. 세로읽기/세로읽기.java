import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        int max_Len = 0;
        for(int i=0;i<5;i++) {
            words[i] = sc.nextLine();
            if(max_Len<words[i].length())
                max_Len = words[i].length();
        }
        for(int i=0;i<max_Len;i++){
            for(int j=0;j<5;j++){
                if(words[j].length()>i){
                    System.out.print(words[j].charAt(i));
                }
            }
        }
    }
}
