import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MainGameManager {


    public static void main(String[] args) throws FileNotFoundException {

  //check whether file contains something or not.
//        File f = new File("Titles.txt");
//        Scanner fs = new Scanner(f);
//        while (fs.hasNextLine()){
//            System.out.println(fs.nextLine());
//        }


        String selectedMovie = GameReader.ReadAndScan();//called from GameReader class
        char[] movieName = selectedMovie.toCharArray();//

        UserInterAction.gameProcess(movieName);


    }

}
