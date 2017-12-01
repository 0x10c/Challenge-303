package io.github.theacid.challenge064;

import java.io.File;
import java.util.Date;

class ModifiedDate {
    public static void main(String[] args) {
        File fileModified = new File("/home/theacid/go1.9.1.linux-amd64.tar.gz");
//        File fileModified = new File("directory_name/file_name");

        Date dateModified = new Date(fileModified.lastModified());
        System.out.println(dateModified);
    }
}