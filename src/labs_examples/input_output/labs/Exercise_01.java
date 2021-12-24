package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        try (BufferedInputStream bStream = new BufferedInputStream(new FileInputStream("/Users/" +
                "chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/byte_data"))) {
            byte[] byteArray = new byte[5];
            int bytesRead = 0;
            FileOutputStream fStream = new FileOutputStream("/Users/chrisparker/Documents/CodingNomads/labs" +
                    "/online-java-fundamentals/src/labs_examples/input_output/files/newByteFile.txt");

            while ((bytesRead = bStream.read(byteArray)) != -1) {
                fStream.write(byteArray);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}