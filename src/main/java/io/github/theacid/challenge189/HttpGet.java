package io.github.theacid.challenge189;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// retrieves a pages.github.com by HTTP GET

public class HttpGet {
    public static void main(String[] args) throws IOException {
        HttpURLConnection connection = null;

        // retrieve the content of webpage
        String requestURL = "https://pages.github.com/";
        try {
            // connection to the specified url created
            URL reqUrl = new URL(requestURL);
            connection = (HttpURLConnection) reqUrl.openConnection();

            // Set the request method type with setRequestMethod()
            connection.setRequestMethod("GET");

            StringBuilder content;

            // Input stream is created from HTTP connection object. Input stream is used to read returned data
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
                String line;

                // StringBuilder to build the content string
                content = new StringBuilder();

                // read data from input stream liny by line with readLine()
                // Each line is added to StringBuilder. After a line append
                // system-dependent line separator string
                while((line = bufferedReader.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            System.out.println(content.toString());

        }
        finally {
            connection.disconnect();
        }
    }
}
