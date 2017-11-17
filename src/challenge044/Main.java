package challenge044;

import java.util.Scanner;

class VowelsInString {
    private static int vowelsInString(String getWords) {
        int i, counter = 0;

        for(i = 0; i < getWords.length(); i++) {
            if(getWords.charAt(i) == 'a'
                    || getWords.charAt(i) == 'ą'
                    || getWords.charAt(i) == 'ę'
                    || getWords.charAt(i) == 'e'
                    || getWords.charAt(i) == 'y'
                    || getWords.charAt(i) == 'i'
                    || getWords.charAt(i) == 'o'
                    || getWords.charAt(i) == 'u'
                    || getWords.charAt(i) == 'ó') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Put your string: ");
        String getWords = inputValue.nextLine();

        System.out.println("Vowels: " + vowelsInString(getWords));
    }
}