package io.github.theacid.challenge066;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReadr {
    public static void main(String[] args) {
//        String filePath = "/home/theacid/.zshrc";
        String filePath = "/directory_name/file_name";
        String line = null;

        try {
            FileReader fileReader = new FileReader(filePath);

            // wrap FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException exc) {
            System.out.println("File " + filePath + "not found.");
        }

        catch (IOException exc) {
            System.out.println("Error reading file " + filePath);
        }
    }
}
