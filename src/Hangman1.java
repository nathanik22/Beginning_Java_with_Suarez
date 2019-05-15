import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Hangman1{
    static String word = "";
    static String wordtwo;
    static String wordthree;

    static String underscores = "";
    static ArrayList<String> listone = new ArrayList<String>();
    static ArrayList<String> listtwo = new ArrayList<String>();
    static ArrayList<String> listthree = new ArrayList<String>();
    static ArrayList<String> listfour = new ArrayList<String>();
    static ArrayList<String> listfive = new ArrayList<String>();
    static ArrayList<String> listsix = new ArrayList<String>();
    static ArrayList<String> listseven = new ArrayList<String>();
    static ArrayList<String> listeight = new ArrayList<String>();
    static ArrayList<String> listnine = new ArrayList<String>();
    static ArrayList<String> listten = new ArrayList<String>();
    static ArrayList<String> listeleven = new ArrayList<String>();
    static ArrayList<String> listtwelve = new ArrayList<String>();
    static ArrayList<String> listthirteen = new ArrayList<String>();
    static ArrayList<String> listfourteen = new ArrayList<String>();
    static ArrayList<String> listfifteen = new ArrayList<String>();
    static ArrayList<String> listsixteen = new ArrayList<String>();
    static ArrayList<String> listseventeen = new ArrayList<String>();
    static ArrayList<String> listeighteen = new ArrayList<String>();
    static ArrayList<String> listnineteen = new ArrayList<String>();
    static ArrayList<String> listtwenty = new ArrayList<String>();
    static ArrayList<String> listtwentyone = new ArrayList<String>();
    static ArrayList<String> listtwentytwo = new ArrayList<String>();
    static ArrayList<String> listtwentythree = new ArrayList<String>();


    static int wordcount = 0;
    static int guesscount = 7;


    public static void wordchoice() throws IOException {
         File fileinput = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/Dictionary");
         Scanner sc = new Scanner(fileinput);
        for (int x = 0; x < 58110; x++) {
            String heck = sc.next();
            int hecklength = heck.length();
            switch(hecklength) {
                case 1:
                    listone.add(heck);
                    break;
                case 2:
                    listtwo.add(heck);
                    break;
                case 3:
                    listthree.add(heck);
                    break;
                case 4:
                    listfour.add(heck);
                    break;
                case 5:
                    listfive.add(heck);
                    break;
                case 6:
                    listsix.add(heck);
                    break;
                case 7:
                    listseven.add(heck);
                    break;
                case 8:
                    listeight.add(heck);
                    break;
                case 9:
                    listnine.add(heck);
                    break;
                case 10:
                    listten.add(heck);
                    break;
                case 11:
                    listeleven.add(heck);
                    break;
                case 12:
                    listtwelve.add(heck);
                    break;
                case 13:
                    listthirteen.add(heck);
                    break;
                case 14:
                    listfourteen.add(heck);
                    break;
                case 15:
                    listfifteen.add(heck);
                    break;
                case 16:
                    listsixteen.add(heck);
                    break;
                case 17:
                    listseventeen.add(heck);
                    break;
                case 18:
                    listeighteen.add(heck);
                    break;
                case 19:
                    listnineteen.add(heck);
                    break;
                case 20:
                    listtwenty.add(heck);
                    break;
                case 21:
                    listtwentyone.add(heck);
                    break;
                case 22:
                    listtwentytwo.add(heck);
                    break;
                case 23:
                    listtwentythree.add(heck);
                    break;
            }
        }


        Scanner newinput = new Scanner(System.in);
        System.out.println("Do you want to choose your own word or generate a random one? (word or random)");
        String yesno = newinput.next();
        if (yesno.equalsIgnoreCase("word")) {
            System.out.println("Please type the word");
            word = newinput.next();
            wordtwo = word;
            wordthree = wordtwo;

        } else if (yesno.equalsIgnoreCase("random")) {
            System.out.println("Do you want to totally generate a random one or generate one with a specific number of letters? (Random or Number)");
            String numorrand = newinput.next();
            if (numorrand.equalsIgnoreCase("random")) {
                Random rand = new Random();
                File ok = new File("/Users/Kadenn/IdeaProjects/Beginning Java with the Suarez/src/Dictionary");
                Scanner mhm = new Scanner(fileinput);
                for (int i = 0; i < rand.nextInt(58109); i++) {
                    word = mhm.next();
                    wordtwo = word;
                    wordthree = wordtwo;
                }}
                else if (numorrand.equalsIgnoreCase("number")) {
                    System.out.println("Please enter the number of letters you want to be in the random word");
                    int numberletterswanted = newinput.nextInt();
                switch(numberletterswanted) {
                    case 1:
                        Collections.shuffle(listone);
                        word = listone.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 2:
                        Collections.shuffle(listtwo);
                        word = listtwo.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 3:
                        Collections.shuffle(listthree);
                        word = listthree.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 4:
                        Collections.shuffle(listfour);
                        word = listfour.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;

                        break;
                    case 5:
                        Collections.shuffle(listfive);
                        word = listfive.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 6:
                        Collections.shuffle(listsix);
                        word = listsix.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 7:
                        Collections.shuffle(listseven);
                        word = listseven.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 8:
                        Collections.shuffle(listeight);

                        word = listeight.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 9:
                        Collections.shuffle(listnine);

                        word = listnine.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 10:
                        Collections.shuffle(listten);

                        word = listten.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 11:
                        Collections.shuffle(listeleven);

                        word = listeleven.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 12:
                        Collections.shuffle(listtwelve);
                        word = listtwelve.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 13:
                        Collections.shuffle(listthirteen);

                        word = listthirteen.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 14:
                        Collections.shuffle(listfourteen);

                        word = listfourteen.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 15:
                        Collections.shuffle(listfifteen);

                        word = listfifteen.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 16:
                        Collections.shuffle(listsixteen);

                        word = listsixteen.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 17:
                        Collections.shuffle(listseventeen);

                        word = listseventeen.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 18:
                        Collections.shuffle(listeighteen);

                        word = listeighteen.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 19:
                        Collections.shuffle(listnineteen);

                        word = listnineteen.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 20:
                        Collections.shuffle(listtwenty);

                        word = listtwenty.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 21:
                        Collections.shuffle(listtwentyone);

                        word = listtwentyone.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 22:
                        Collections.shuffle(listtwentytwo);

                        word = listtwentytwo.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                    case 23:
                        Collections.shuffle(listtwentythree);

                        word = listtwentythree.get(0);
                        wordtwo = word;
                        wordthree = wordtwo;
                        break;
                }
                    }

                }

                int listvariable = 0;

        ArrayList<String> letters = new ArrayList<String>();
//        while()word needs to be checked if when trying to get the letter at index, check if word has an index of listvariable
//        {
//             letters.add(substring.word(listvariable))
//             listvariable++;
//        }
        Scanner input = new Scanner(word);
        String letterstoguess = "";
        System.out.println("");
        //Below is the loop of listing the length of the word for the player.
        int wordlength = word.length();
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

        public static void guessing() {
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
            Scanner job = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            hanger(7-guesscount);
            System.out.println("");
            System.out.println("Guesses left: "+guesscount);
            System.out.println("Incorrect Guesses: "+badlist);
            System.out.println("");
            System.out.println("");
            System.out.println("Please guess a letter");
            String currentguess = job.next();
            int try1 = word.indexOf(currentguess);
            int heck;
            if(try1<0 && !(badlist.contains(currentguess))){
                for(int i = 0; i < 50; i++) {
                    System.out.println();
                }
                guesscount--;

                System.out.println(currentguess+" was not in the word");
                badlist.add(currentguess);

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

            }

            else if(try1>= 0 && !(list.contains(currentguess))){
                for(int i = 0; i < 50; i++) {
                    System.out.println();
                }
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


//                if(list.contains(currentguess)){
//                    System.out.print(currentguess+" ");
//                }
//                if(!(list.contains(currentguess))){
//                    System.out.print("_ ");
//                }
//                System.out.println();
            }
            else if(try1>= 0 && list.contains(currentguess)) {
                for(int i = 0; i < 50; i++) {
                    System.out.println();
                }
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
                    }}
                }

            else if(try1<0 && badlist.contains(currentguess)){
                for(int i = 0; i < 50; i++) {
                    System.out.println();
                }
                System.out.println(currentguess +" has already been guessed but is not in the word");
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
            }

        }}
        public static void checkWin() {

            if ((wordtwo.equals(""))) {
                hanger(7-guesscount);
                System.out.println("");
                System.out.println("");
                System.out.println("YOU HAVE GUESSED CORRECTLY");
                System.out.println("");
                System.out.println("");
                System.out.println("The word was "+word);
            } else if (guesscount == 0) {
                for(int i = 0; i < 4; i++) {
                    System.out.println();
                }
                hanger(7);
                System.out.println("");
                System.out.println("");
                System.out.println("You ran out of guesses. The man died.");
                System.out.println("");
                System.out.println("");
                System.out.println("The word was "+word);
            }
        }
        public static void hanger(int parts) {
            switch(parts) {
                case 0:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("_________|_________");
                    break;
                case 1:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |                      _____");
                    System.out.println("         |                    _|     |_");
                    System.out.println("         |                   |_________|");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("_________|_________");
                    break;
                case 2:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |                      _____");
                    System.out.println("         |                    _|     |_");
                    System.out.println("         |                   |_________|");
                    System.out.println("         |                     / _ _ \\");
                    System.out.println("         |                    (   ^   )");
                    System.out.println("         |                     \\_____/");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("_________|_________");
                    break;
                case 3:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |                      _____");
                    System.out.println("         |                    _|     |_");
                    System.out.println("         |                   |_________|");
                    System.out.println("         |                     / _ _ \\");
                    System.out.println("         |                    (   ^   )");
                    System.out.println("         |                     \\_____/");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       |_|");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("_________|_________");
                    break;
                case 4:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |                      _____");
                    System.out.println("         |                    _|     |_");
                    System.out.println("         |                   |_________|");
                    System.out.println("         |                     / _ _ \\");
                    System.out.println("         |                    (   ^   )");
                    System.out.println("         |                     \\_____/");
                    System.out.println("         |                      _| |");
                    System.out.println("         |                     / | |");
                    System.out.println("         |                    /  | |");
                    System.out.println("         |                   /   | |");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       |_|");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("_________|_________");
                    break;
                case 5:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |                      _____");
                    System.out.println("         |                    _|     |_");
                    System.out.println("         |                   |_________|");
                    System.out.println("         |                     / _ _ \\");
                    System.out.println("         |                    (   ^   )");
                    System.out.println("         |                     \\_____/");
                    System.out.println("         |                      _| |_");
                    System.out.println("         |                     / | | \\");
                    System.out.println("         |                    /  | |  \\");
                    System.out.println("         |                   /   | |   \\");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       |_|");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("         |");
                    System.out.println("_________|_________");
                    break;
                case 6:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |                      _____");
                    System.out.println("         |                    _|     |_");
                    System.out.println("         |                   |_________|");
                    System.out.println("         |                     / _ _ \\");
                    System.out.println("         |                    (   ^   )");
                    System.out.println("         |                     \\_____/");
                    System.out.println("         |                      _| |_");
                    System.out.println("         |                     / | | \\");
                    System.out.println("         |                    /  | |  \\");
                    System.out.println("         |                   /   | |   \\");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       |_|");
                    System.out.println("         |                      /");
                    System.out.println("         |                     /");
                    System.out.println("         |                    /");
                    System.out.println("         |");
                    System.out.println("_________|_________");
                    break;
                case 7:
                    System.out.println("          ________________________");
                    System.out.println("         | /                      |");
                    System.out.println("         |/                       |");
                    System.out.println("         |                      _____");
                    System.out.println("         |                    _|     |_");
                    System.out.println("         |                   |_________|");
                    System.out.println("         |                     / _ _ \\");
                    System.out.println("         |                    (   ^   )");
                    System.out.println("         |                     \\_____/");
                    System.out.println("         |                      _| |_");
                    System.out.println("         |                     / | | \\");
                    System.out.println("         |                    /  | |  \\");
                    System.out.println("         |                   /   | |   \\");
                    System.out.println("         |                       | |");
                    System.out.println("         |                       |_|");
                    System.out.println("         |                      /   \\");
                    System.out.println("         |                     /     \\");
                    System.out.println("         |                    /       \\");
                    System.out.println("         |");
                    System.out.println("_________|_________");
            }
        }

    }
