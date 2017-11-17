package challenge045;

import java.util.Scanner;

public class Main {
    private static int wordsInString(String getWords) {
        int i, counter = 0;

        if(!(" ".equals(getWords.substring(0, 1))) || !(" ".equals(getWords.substring(getWords.length())))) {
            for(i = 0; i < getWords.length(); i++) {
                if(getWords.charAt(i) == ' ') {
                    counter++;
                }
            }
            counter = counter + 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Put your string: ");
        String getWords = inputValue.nextLine();

        System.out.println("Words: " + wordsInString(getWords));
    }
}