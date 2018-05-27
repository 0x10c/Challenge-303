package io.github.theacid.challenge076;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // creating file object
        File file = new File("/home/theacid/go/src/awesomeProject/main.go");
        BufferedInputStream bufferedInputStream = null;

        try {
            // create FileInputObject
            FileInputStream fileInputStream = new FileInputStream(file);

            //create object of BufferedInputStream
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            // byte array
            byte[] context = new byte[1024];

            int bytesRead = 0;
            String strFileContext;

            while((bytesRead = bufferedInputStream.read(context)) != -1) {
                strFileContext = new String(context, 0, bytesRead);
                System.out.println(strFileContext);
            }
        }

        catch(FileNotFoundException exc) {
            exc.printStackTrace();
        }

        catch (IOException exc) {
            exc.printStackTrace();
        }

        finally {
            // closing BufferedInputStream
            try {
                if(bufferedInputStream != null)
                    bufferedInputStream.close();
            }
            catch(IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}


