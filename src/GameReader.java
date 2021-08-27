import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class GameReader {
    public static String array[] = new String[100];

    static String ReadAndScan() throws FileNotFoundException {

        File file = new File("Titles.txt");
        Scanner fileScanner = new Scanner(file);
        int i = 0;
        while(fileScanner.hasNextLine()) {
            array[i] = fileScanner.nextLine();
            i += 1;
        }
        int numOfIndex = indexRandom(i);

        return array[numOfIndex];
    }

    static int indexRandom(int range){
        Random dice = new Random();
        int number = dice.nextInt(range);
        return number;
    }
}
