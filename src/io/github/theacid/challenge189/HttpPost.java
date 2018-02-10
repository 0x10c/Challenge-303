package io.github.theacid.challenge189;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpPost {
    private static HttpURLConnection connection;

    public static void main(String[] args) throws IOException, MalformedURLException, ProtocolException {

        String url = "";
        String urlParam = "";
        byte[] postData = urlParam.getBytes(StandardCharsets.UTF_8);

        try {
            URL webUrl = new URL(url);
            connection = (HttpURLConnection) webUrl.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("User-Agent", "Java client");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            try (DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream())) {
                    dataOutputStream.write(postData);
            }

            StringBuilder content;

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                content = new StringBuilder();

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
