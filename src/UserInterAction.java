
import java.util.Scanner;

public class UserInterAction {

    public static void gameProcess(char[] movieName){
        Scanner scan = new Scanner(System.in);
        char letter = '0';
        boolean winOrLoss = false;
        int wrongGuess = 0;
        char[] wrongGuesses = new char[20];
        char[] inputName = new char[movieName.length];
        int rightGuessing = 0;
        int count = 0;
        System.out.print("You are guessing:");
        for(int i = 0; i < movieName.length; i++) {
            inputName[i] = '_';
            System.out.print(inputName[i]);
        }System.out.print("\n");

        while(!winOrLoss){

            System.out.print("You have guessed (" + wrongGuess + ") wrong letters:");
            for(int i = 0; wrongGuesses[i] != '\0' ; i++){
                System.out.print(wrongGuesses[i] + " ");
            }System.out.print("\n");

            System.out.print("Guess a letter :");



            letter = scan.next().charAt(0);

            for(int i = 0; i < movieName.length; i++) {
                if(letter == movieName[i]){
                    if(inputName[i] != movieName[i])
                        count++;
                    inputName[i] = movieName[i];

                }
            }
            if(count == 0){
                wrongGuesses[wrongGuess] = letter;
                wrongGuess++;
            }else{
                rightGuessing += count;
            }

            if(wrongGuess >= 10){
                System.out.println("You have Lost");
                break;
            }
            if(rightGuessing == movieName.length){
                System.out.println("You win!");
                System.out.println("You have guessed " + String.valueOf(movieName) + " correctly");
                break;
            }

            System.out.print("You are guessing:");
            count = 0;
            for(int i = 0; i < movieName.length; i++) {
                System.out.print(inputName[i]);
            }System.out.print("\n");


        }
    }
}
