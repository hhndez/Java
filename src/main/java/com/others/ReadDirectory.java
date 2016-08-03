package com.others;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

/**
 * Created by Optiplex on 20/07/16.
 */
public class ReadDirectory {
    public static void listFilesForFolder(final List<String> files, final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(files, fileEntry);
            } else {
                if (fileEntry.getName().endsWith(".config")) {
                    files.add(fileEntry.getAbsolutePath());
                }
            }
        }
    }
    public static void main(String ... args) {
        final File folder = new File("/Users/Optiplex/IdeaProjects/ConfigFiles/Monet/");
        List<String> files = new ArrayList();
        listFilesForFolder(files, folder);
        out.println("Numero de archivos a validar:" + files.size());
        try {
            files.stream().forEach(f -> ReadXMLFile.validXMLFile(f));
        } catch (Exception e){
            out.println("Error al validar archivo:" + e);
        }
    }
}
