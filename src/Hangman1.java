import java.util.Scanner;

public class Hangman1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the word");
        String word = sc.next();
        int wordlength = word.length();
        int wordcount = 0;
        int guesscount = 0;
        //Below is the loop of listing the length of the word for the player.
        while(wordcount<wordlength)
        {
            System.out.print("_ ");
            wordcount++;
        }
        //Here is the loop of the player guessing letters.
        while (guesscount<7)
        {
            System.out.println("Please guess a letter");
            String letterguess = sc.next();
            try
            {
                int try1 = word.indexOf(letterguess);
                System.out.println(letterguess+" was in the word");
            }
            catch(NumberFormatException nfe){

            }
        }


    }
}
