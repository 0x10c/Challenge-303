package io.github.theacid.challenge185;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class FindDuplicateCharactersInString {
    private void findCharacters(String givenString) {
        Map<Character, Integer> duplicateMap = new HashMap();
        char[] characters = givenString.toCharArray();
        for(Character chars : characters) {
            if(duplicateMap.containsKey(chars)) {
                duplicateMap.put(chars, duplicateMap.get(chars) + 1);
            }
            else {
                duplicateMap.put(chars, 1);
            }
        }

        Set<Character> keyValues = duplicateMap.keySet();
        for(Character chars : keyValues) {
            if(duplicateMap.get(chars) > 1) {
                System.out.println(chars + " founded " + duplicateMap.get(chars) + " times.");
            }
        }
    }

    public static void main(String[] args) {
        FindDuplicateCharactersInString findDuplicates = new FindDuplicateCharactersInString();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine();

        findDuplicates.findCharacters(string);
    }
}
