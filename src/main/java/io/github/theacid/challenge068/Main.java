package io.github.theacid.challenge068;

import java.io.*;

class ReadLineByLine {
    public static void main(String[] args) {
        String line = "";

        try {
            String file = "/home/theacid/PrintSomething.txt";
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("New text");
            fileWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("home/theacid/PrintSomething.txt"));
            while(line != null) {
                StringBuilder stringBuilder = null;
                stringBuilder.append(line);
                line = bufferedReader.readLine();
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch(IOException exc) {} {
            System.out.println("Error");
        }
    }
}
