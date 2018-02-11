//package io.github.theacid.challenge183;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.StringTokenizer;
//
//class Main {
//    private Map<Integer, String> getWordsCount(String filename) {
//        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
//        FileInputStream fileInputStream = null;
//        DataInputStream dataInputStream = null;
//        BufferedReader bufferedReader = null;
//        String line = null;
//
//        try {
//            fileInputStream = new FileInputStream(filename);
//            dataInputStream = new DataInputStream(fileInputStream);
//            bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
//
//            while((line = bufferedReader.readLine()) != null) {
//                StringTokenizer stringTokenizer = new StringTokenizer(line, "");
//
//                while(stringTokenizer.hasMoreTokens()) {
//                    String temp = stringTokenizer.nextToken().toLowerCase();
//                    if(wordsMap.containsKey(temp)) {
//                        wordsMap.put(temp, wordsMap.get(temp) + 1);
//                    }
//                }
//            }
//        }
//        catch(FileNotFoundException exc) {
//            System.out.println();
//        } catch (IOException exc) {
//            System.out.println(exc);
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
