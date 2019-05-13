import java.util.Scanner;
import java.util.*;

public class hangman_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the word");
        String w = sc.next();
        ArrayList<String> word = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            word.add(Character.toString(w.charAt(i)));
        }
        boolean[] guessed = new boolean[word.size()];
        for(int i = 0; i < guessed.length; i++) {
            guessed[i] = false;
        }
        System.out.println("Enter a guess");
        String guess = sc.next().substring(0,1);
        for(int i = 0; i < word.size(); i++) {
            if(word.get(i).equals(guess)) {
                guessed[i] = true;
            }
        }
        for(int i = 0; i < word.size(); i++) {
            if(guessed[i]) {
                System.out.print(" "+word.get(i)+" ");
            } else {
                System.out.print(" _ ");
            }
        }
    }
}
