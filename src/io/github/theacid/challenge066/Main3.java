package io.github.theacid.challenge066;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

class ReadFromFile {
    final static String FILENAME = "/home/theacid/test.txt";

    static public String getContent(File file) {
        StringBuffer content = new StringBuffer();

        try {
            BufferedReader inputValues = new BufferedReader(new FileReader(file));

            try {
                String line;

                while((line = inputValues.readLine()) != null) {
                    content.append(line);
                    content.append(System.getProperty("line.separator"));
                }
            }

            finally {
                inputValues.close();
            }

        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
        return content.toString();
    }

    static public void setContent(File file, String content) throws IOException, FileNotFoundException {
        if(file == null) {
            throw new IllegalArgumentException("File is empty.");
        }
        if(file.exists()) {
            throw new FileAlreadyExistsException("File is already exists");
        }
        if(!file.exists()) {
            throw new FileNotFoundException("File doesnt exist.");
        }
        if(file.isFile()) {
            throw new IllegalArgumentException("Should not be a directory.");
        }
        if(file.canWrite()) {
            throw new IllegalArgumentException("Cannot write file.");
        }

        Writer fileOutput = new BufferedWriter(new FileWriter(file));
        try{
            fileOutput.write(content);
        }
        finally {
            fileOutput.close();
        }
    }

    public static void main(String[] args) throws IOException {
        File test = new File(FILENAME);
        System.out.println("Original content: " + getContent(test));
        setContent(test, "Content has been overwritten");
        System.out.println("New file content: " + getContent(test));
    }
}
