package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        try (BufferedReader bw = new BufferedReader(new FileReader("/Users/" +
                "chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("/Users/" +
                    "chrisparker/Documents/CodingNomads/labs" +
                    "/online-java-fundamentals/src/labs_examples/input_output/files/char_encrypted.txt"))) {
            String line;

            while ((line = bw.readLine()) != null) {
                line = line.replace('a','-');
                line = line.replace('e','~');
                pw.println(line);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
