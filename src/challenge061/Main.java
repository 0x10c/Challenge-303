package challenge061;

import java.io.File;

class FileListing {
    public static void main(String[] args) {
        File file = new File("/home/theacid");
//        File file = new File("/directory_name/");

        String filesList[] = file.list();
        for(String name : filesList) {
            System.out.println(name);
        }
    }
}
