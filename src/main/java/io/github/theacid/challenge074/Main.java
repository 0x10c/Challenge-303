package io.github.theacid.challenge074;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String path = File.separator + "theacid" + File.separator + "10";
        File newFile = new File(path);

        System.out.println("File path: " + newFile.getPath());
    }
}
