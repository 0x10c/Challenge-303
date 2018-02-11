package io.github.theacid.challenge070;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> blocks = Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM" );

        for(String word : Arrays.asList("", "A", "BARK", "BOOK", "TREAT", "COMMON", "SQUAD", "CONFUSE")) {
            //System.out.printf(word.isEmpty() ? "\"\"" : word, canMakeWord(word, blocks));
        }
    }

    private static boolean canMakeWord(String word, String[] blocks) {

        return false;
    }
}
