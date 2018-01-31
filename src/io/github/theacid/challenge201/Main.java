package io.github.theacid.challenge201;//package io.github.theacid.challenge183;

import java.io.*;
import java.util.*;

class RepeatedWords {
    private Map<String, Integer> getWordsCount(String filename) {
        Map<String, Integer> wordsMap = new HashMap<>();
        // Reading bytes from file
        FileInputStream fileInputStream;
        //
        DataInputStream dataInputStream;
        // reading text line by line with readLine() method
        BufferedReader bufferedReader = null;
        String line;

        try {
            fileInputStream = new FileInputStream(filename);
            dataInputStream = new DataInputStream(fileInputStream);
            bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));

            while((line = bufferedReader.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, "");

                while(stringTokenizer.hasMoreTokens()) {
                    String temp = stringTokenizer.nextToken().toLowerCase();
                    if(wordsMap.containsKey(temp)) {
                        wordsMap.put(temp, wordsMap.get(temp) + 1);
                    }
                }
            }
        }
        catch(FileNotFoundException exc) {
            System.out.println("File does not exists.");
        }
        catch (IOException exc) {
            System.out.println(exc);
        }
        finally {
            try {
                if(bufferedReader != null) bufferedReader.close();
            }
            catch(IOException exc) { System.out.println(exc); }
        }
        return wordsMap;
    }

    public List<Map.Entry<String, Integer>> sort(Map<String, Integer> wordsMap) {
        Set<Map.Entry<String, Integer>> wordsSet = wordsMap.entrySet();
        List<Map.Entry<String, Integer>> wordsList = new ArrayList<>(wordsSet);

        Collections.sort(wordsList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return(o2.getValue().compareTo(o1.getValue()));
            }
        });
        return wordsList;
    }

    public static void main(String[] args) {
        RepeatedWords repeatedWords = new RepeatedWords();
        Map<String, Integer> wordsMap = repeatedWords.getWordsCount("/home/theacid/words.txt");

        List<Map.Entry<String, Integer>> wordsList = repeatedWords.sort(wordsMap);
        for(Map.Entry<String, Integer> entry:wordsList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
