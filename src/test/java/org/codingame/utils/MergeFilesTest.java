package org.codingame.utils;

import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test for {@link MergeFiles}
 */
public class MergeFilesTest {

    private static final String TEST_TEMPLATE = "TestTemplate";
    private static final String SOURCE_DIRECTORY = "testsourcedir";
    private static final String OUTPUT_FILE = "Player";

    @Test
    public void output_file_should_exist() throws Exception {
        MergeFiles mergeFiles = new MergeFiles();
        mergeFiles.mergeFilesWithTemplate(TEST_TEMPLATE, SOURCE_DIRECTORY, OUTPUT_FILE);

        File outputFile = new File("src\\test\\java\\org\\codingame\\utils\\Player");
        assertThat("Output file exists", outputFile.exists(), is(true));
    }
}
