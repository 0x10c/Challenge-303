package io.github.theacid.challenge063;

import java.io.File;

class CheckIfPathExists {
    public static void main(String[] args) {
        // File filePath = new File("/home/theacid/go1.9.1.linux-amd64.tar.gz");
        File filePath = new File("/directory_name/file_name");
        if(filePath.exists()) {
            System.out.println(filePath.getName() + " exists.");
        }
        else {
            System.out.println("http://nooooooooooooooo.com/!");
        }
    }
}