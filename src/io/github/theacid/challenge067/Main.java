package io.github.theacid.challenge067;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ReadLineByLine {
    public static void main(String[] args) {
        BufferedReader bufferedReader;
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/theacid/test.txt"));
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }

        catch(FileNotFoundException exc) {
            System.out.println("Sorry. File not found.");
        }

        catch(IOException exc) {
            System.out.println("Sorry. Cannot read file.");
        }
    }
}
