package challenge062;

import java.io.File;
import java.io.FilenameFilter;

class FileExtensionsList {
    public static void main(String[] args) {
//        File file = new File("/home/theacid");
        File file = new File("/directory_name/");

        String filesList[] = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File filesExtension, String name) {
                if(name.toLowerCase().endsWith(".log")) {
                    return true;
                }
                else {
                    return false;
                }
            }
        });

        for(String files : filesList) {
            System.out.println(files);
        }
    }
}
