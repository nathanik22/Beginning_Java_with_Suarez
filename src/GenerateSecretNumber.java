import java.util.*;
public class GenerateSecretNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomInt = rand.nextInt(101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number below (between 1-100)");
        for (int count = 0; count < 5; count++) {
            int dang = input.nextInt();
            if (dang == randomInt) {
                System.out.println("You guessed the number!");
                System.exit(0);
            }
            else if (dang < randomInt - 10 || dang > randomInt + 10) {
                System.out.println("You missed by a little");
            }
            else if (dang < randomInt - 20 || dang > randomInt + 20) {
                System.out.println("You missed by a lot");
            } else if (dang > randomInt - 20 || dang < randomInt + 20) {
                System.out.println("You missed by not too much");
            } else if (dang < 0 || dang > 100) {
                System.out.println("WHAT ARE YOU DOING YOU ARE SO FAR OFF");
            }
        }
        System.out.println("You ran out of tries, the number was " + randomInt);
    }
}

