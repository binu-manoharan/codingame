package org.codingame.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Merge files with player template for submission on coding game website.
 */
class MergeFiles {

    //TODO Create constants.
    //TODO Create new file, list source directory and merge all java files into the new file.
    //TODO Make necessary substitutions.
    //import/package removed, public class/enum/interface/abstract class with public removed.
    void mergeFilesWithTemplate(String templatePath, String sourceDirectory, String outputFile) throws IOException {
        Path source = Paths.get("src\\test\\java\\org\\codingame\\utils\\testarea\\TestTemplate");
        Path destination = Paths.get("src\\test\\java\\org\\codingame\\utils\\Player");

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
