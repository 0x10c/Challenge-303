package io.github.theacid.challenge066;

import java.io.*;

class FileBufferedReader {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
//            fileReader = new FileReader("/home/theacid/.zshrc");
            fileReader = new FileReader("/directory_name/file_name");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }

        catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

        catch (IOException exc) {
            exc.printStackTrace();
        }

        finally {
            try {
                if(bufferedReader != null) {
                    bufferedReader.close();
                }
                if(fileReader != null) {
                    fileReader.close();
                }
            }

            catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}
