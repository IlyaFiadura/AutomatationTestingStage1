import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OptionalTask4 {
    public static void main(String[] args) {
        List<String> lyrics = new ArrayList<>();
        lyrics.add("Remember the good old 1980s?");
        lyrics.add("When things were so uncomplicated?");
        lyrics.add("I wish i could go back there again");
        lyrics.add("And everything could be the same.");

        System.out.println(lyrics);

        Collections.sort(lyrics, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(lyrics);
    }
}