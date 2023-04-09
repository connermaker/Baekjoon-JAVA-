import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = new String();
        word = sc.nextLine();
        int words = 0;
        for(int i=0;i<word.length();i++){
            if(i<word.length()-1) {
                switch (word.charAt(i)) {
                    case 'c':
                        if(word.charAt(i+1) == '='||word.charAt(i+1)=='-')
                            i++;
                        break;
                    case 'd':
                        if(word.charAt(i+1) == '-')
                            i++;
                        else if(i<word.length()-2){
                            if(word.charAt(i+1)=='z'&&word.charAt(i+2)=='=')
                                i+=2;
                        }
                        break;
                    case 'l':
                    case 'n':
                        if(word.charAt(i+1)=='j')
                            i++;
                        break;
                    case 's':
                    case 'z':
                        if(word.charAt(i+1) == '=')
                            i++;
                        break;
                    default:
                        break;
                }
            }
            words++;
        }
        System.out.println(words);
    }
}
