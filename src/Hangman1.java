import java.util.Scanner;
import java.util.*;

public class Hangman1 {
    String word = "";
    String wordtwo = word;
    String wordthree = word;
    String underscores = "";
    int wordlength = word.length();
    int wordcount = 0;
    int guesscount = 7;
    Scanner sc = new Scanner(System.in);
    public void wordtime() {

        System.out.println("Please type the word");
        String word = sc.next();
        int listvariable = 0;

        ArrayList<String> letters = new ArrayList<String>();
//        while()word needs to be checked if when trying to get the letter at index, check if word has an index of listvariable
//        {
//             letters.add(substring.word(listvariable))
//             listvariable++;
//        }
        Scanner input = new Scanner(word);
        String letterstoguess = "";

        //Below is the loop of listing the length of the word for the player.
        while (wordcount < wordlength) {
            System.out.print("_ ");
            wordcount++;
        }
//        Scanner input = new Scanner(word);
//        while (input.hasNext()){
//            letters.add(input.next());
//        }
        //^^^ that was because when i guessed the word but with the letters not in order, it wouldnt say that you guessed correctly
        // so I thought maybe to compare arraylists it wouldnt matter the order
        System.out.println();
    }
        public void guessing(){
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> badlist = new ArrayList<String>();
        //Here is the loop of the player guessing letters.
//        while (guesscount<7 && (!(list.equals(letters))))
//        {
//            System.out.println("Please guess a letter");
//            String currentguess = sc.next();
//                int try1 = word.indexOf(currentguess);
//                if(try1<0 && !(badlist.contains(currentguess))){
//                    System.out.println(currentguess+" was not in the word");
//                    guesscount++;
//                    badlist.add(currentguess);
//                }
//                else if(try1>= 0 && !(list.contains(currentguess))){
//                    System.out.println(currentguess+" was in the word at index "+try1);
//                    list.add(currentguess);
//                    letterstoguess = letterstoguess+currentguess;
//                }
//                else if(try1>= 0 && list.contains(currentguess)) {
//                    System.out.println(currentguess + " has already been guessed and is in the word at index "+try1);
//                }
//                else if(try1<0 && badlist.contains(currentguess)){
//                    System.out.println(currentguess +" has already been guessed but is not in the word");
//                }
//
//        }
//        if((list.equals(letters))){
//            System.out.println("You have guessed the word");
//        }
//        else if(guesscount ==7)
//        {
//            System.out.println("You ran out of guesses. The man died.");
//        }

        //^^ THAT WAS COMPARING THE ARRAY LISTS OF THE CORRECT LETTERS TO THE ARRAY LIST OF THE GUESSED LETTERS.
//        while (guesscount<7 && (!(word.equals(letterstoguess))))
//        {
//            System.out.println("Please guess a letter");
//            String currentguess = sc.next();
//            int try1 = word.indexOf(currentguess);
//            if(try1<0 && !(badlist.contains(currentguess))){
//                System.out.println(currentguess+" was not in the word");
//                guesscount++;
//                badlist.add(currentguess);
//            }
//            else if(try1>= 0 && !(list.contains(currentguess))){
//                System.out.println(currentguess+" was in the word at index "+try1);
//                list.add(currentguess);
//                letterstoguess = letterstoguess+currentguess;
//            }
//            else if(try1>= 0 && list.contains(currentguess)) {
//                System.out.println(currentguess + " has already been guessed and is in the word at index "+try1);
//            }
//            else if(try1<0 && badlist.contains(currentguess)){
//                System.out.println(currentguess +" has already been guessed but is not in the word");
//            }
//
//        }
//        if((word.equals(letterstoguess))){
//            System.out.println("You have guessed the word");
//        }
//        else if(guesscount ==7)
//        {
//            System.out.println("You ran out of guesses. The man died.");
//        }
        while (guesscount>0 && (!(wordtwo.equalsIgnoreCase(""))))
        {
            System.out.println("Please guess a letter");
            String currentguess = sc.next();
            int try1 = word.indexOf(currentguess);
            int heck;
            if(try1<0 && !(badlist.contains(currentguess))){
                System.out.println(currentguess+" was not in the word");
                badlist.add(currentguess);
                guesscount--;
                System.out.println("Guesses left: "+guesscount);
                System.out.println("Incorrect Guesses: "+badlist);
                System.out.println("");
                System.out.println("");

            }

            else if(try1>= 0 && !(list.contains(currentguess))){

                list.add(currentguess);
                wordtwo = wordtwo.replace(currentguess, "");
//                underscores = underscores.replace(underscores.substring(try1), currentguess);
//                System.out.println(underscores);
//                heck = try1;
//                int counter = 0;
//                while(counter <heck)
//                {
//                    System.out.print("_ ");
//                    counter++;
//                }
//                System.out.print(currentguess+" ");
//                counter = counter +2;
//                while(counter<=word.length()){
//                    System.out.print("_ ");
//                    counter++;
//                }
                int counter = 0;
                while(counter<word.length()){
                if(list.contains(Character.toString(word.charAt(counter)))){
                    System.out.print((Character.toString(word.charAt(counter)))+" ");
                    counter++;
                }
                else if(!(list.contains(Character.toString(word.charAt(counter))))){
                    System.out.print("_ ");
                    counter++;
                }}
                System.out.println("");
                System.out.println("Guesses left: "+guesscount);
                System.out.println("Incorrect Guesses: "+badlist);
                System.out.println("");
                System.out.println("");
//                if(list.contains(currentguess)){
//                    System.out.print(currentguess+" ");
//                }
//                if(!(list.contains(currentguess))){
//                    System.out.print("_ ");
//                }
//                System.out.println();
            }
            else if(try1>= 0 && list.contains(currentguess)) {
                int counter = 0;
                System.out.println(currentguess+" has already been guessed");
                while(counter<word.length()){
                    if(list.contains(Character.toString(word.charAt(counter)))){
                        System.out.print((Character.toString(word.charAt(counter)))+" ");
                        counter++;
                    }
                    else if(!(list.contains(Character.toString(word.charAt(counter))))){
                        System.out.print("_ ");
                        counter++;
                    }}System.out.println("Guesses left: "+guesscount);
                System.out.println("Incorrect Guesses: "+badlist);
                System.out.println("");
                System.out.println("");}

            else if(try1<0 && badlist.contains(currentguess)){
                System.out.println(currentguess +" has already been guessed but is not in the word");
                System.out.println("Guesses left: "+guesscount);
                System.out.println("Incorrect Guesses: "+badlist);
                System.out.println("");
                System.out.println("");
            }

        }}
        public void checkWin() {

            if ((wordtwo.equals(""))) {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("YOU HAVE GUESSED CORRECTLY");
            } else if (guesscount == 7) {
                System.out.println("");
                System.out.println("");
                System.out.println("You ran out of guesses. The man died.");
            }
        }

    }
