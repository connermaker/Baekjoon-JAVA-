import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = new String();
        while (sc.hasNextLine()) {
            word = sc.nextLine().toString();
            if(word.equals(""))
                break;
            System.out.println(word);
        }
    }
}
