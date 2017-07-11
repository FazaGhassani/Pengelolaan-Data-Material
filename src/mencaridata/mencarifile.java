package mencaridata;

import java.io.File;

public class mencarifile {
    static File findFile(final String rootFilePath, final String fileToBeFound) {

        File rootFile = new File(rootFilePath);
        File[] subFiles = rootFile.listFiles();
        for (File file : subFiles != null ? subFiles : new File[]{}) {
            if (file.getAbsolutePath().endsWith(fileToBeFound)) {
                return file;
            } else if (file.isDirectory()) {
                File f = findFile(file.getAbsolutePath(), fileToBeFound);
                if (f != null) {
                    return f;
                }
            }
        }
        return null; // null returned in case your file is not found
        //source code : https://stackoverflow.com/questions/25422244/java-automatically-detecting-input-file-path
    }
}
