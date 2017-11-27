package challenge065;

import java.io.File;

class Main {
    public static void main(String[] args) {
        File file = new File("/home/theacid/go1.9.1.linux-amd64.tar.gz");
//        File file = new File("directory_name/file_name");
        if(file.exists()) {
            System.out.println(sizeInBytes(file));
            System.out.println(sizeInKilobytes(file));
            System.out.println(sizeInMegabytes(file));
        }
    }

    private static String sizeInMegabytes(File file) {
        return (double) file.length()/(1024*1024) + " megabytes.";
    }

    private static String sizeInKilobytes(File file) {
        return (double) file.length()/(1024) + " kilobytes.";
    }

    private static String sizeInBytes(File file) {
        return (double) file.length() + " bytes.";
    }
}