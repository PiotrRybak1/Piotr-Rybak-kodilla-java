package kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beatify("A", "B","C",(a,b,c) -> (a+b+c).toLowerCase());
        poemBeautifier.beatify("A", "B","C",(a,b,c) -> (a+b+c) + "DDDDD");
        poemBeautifier.beatify("A", "B","C",(a,b,c) -> (a+b+c).substring(1));
        poemBeautifier.beatify("A", "B","C",(a,b,c) -> String.valueOf((a+b+c).length()) + (a+b+c));
        poemBeautifier.beatify("A", "B","C",(a,b,c) -> String.valueOf((a+b+c).hashCode()));

    }
}


