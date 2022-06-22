import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static void main(String args[]){
        
        // target word and max num of tries
        String  target = args[0];
        int     maxTry = Integer.parseInt(args[1]);

        // history of all inputs and num of allready tries
        char[]  history = new char[maxTry];
        int     iHistory = 0;
        int     numTry = 0;
    
        // ["_" * n] visu output for player
        char[]  visual = initVisual(target.length());

        // store newest user input
        String  input;
        char    cInput;
        // is guess a valid try
        boolean valid = true;
        // is guess correct
        boolean corr  = false;

        // scanner
        Scanner conReader = new Scanner(System.in);



        while (true) {

            // show visual
            for (char c : visual) {
                System.out.print(c);
            } System.out.println();

            // target guessed
            if (Arrays.equals(target.toCharArray(), visual)) {
                System.out.println(numTry + " Versuche für " + target);
                // end game
                conReader.close();
                break;
            }

            // out of guesses
            if (numTry >= maxTry) {
                System.out.println("Maximale Anzahl an Versuchen ueberschritten");
                // end game
                conReader.close();
                break;
            }

            input = conReader.next();
            valid = true;
            corr  = false;

            // char
            if (input.length() == 1) {
                cInput = input.charAt(0);
                // char repeated ?
                for (char c : history) {
                    if (cInput == c) {
                        valid = false;
                        break;
                    }
                } if (!valid) {
                    System.out.println("Buchstabe kam bereits vor");
                    continue;
                }
                // char is valid --> write to history
                history[iHistory] = cInput;
                iHistory ++;
                // char in target ?
                for (char c : target.toCharArray()) {
                    if (cInput == c) {
                        corr = true;
                        // update visual
                        for (int i = 0; i < target.length(); i++) {
                            if (cInput == target.charAt(i)) {
                                visual[i] = cInput;
                            }
                        }
                        break;
                    }
                }
            }

            // string (! ideal input !)
            else {
                valid = true;
                System.out.println("STRING"+target);
                // guess is right?
                if (input.equals(target)) {
                    System.out.println(++numTry + " Versuche für " + target);
                    // end game
                    conReader.close();
                    break;
                }
            }

            // input was valid
            if (valid) {
                numTry++;
            }
        }
    }


    public static char[] initVisual (int n) {
        char[] out = new char[n];
        for (int i = 0; i < n; i++) {
            out[i] = '_';
        } return out;
    }
}