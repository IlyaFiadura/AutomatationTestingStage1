import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask6 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("/AutomatationTestingStage1/JavaCollections/song.txt"));
        ArrayList<String> songLyrics = new ArrayList<>();

        while (scan.hasNext()) {
            songLyrics.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(songLyrics);
        for (String sortedLyrics : songLyrics) {
            System.out.println(sortedLyrics);
        }
    }
}
