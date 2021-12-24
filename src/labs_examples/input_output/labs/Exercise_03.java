package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        String file_1 = "/Users/chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/byte_data";
        String file_2 = "/Users/chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/byte_data";
        String file_3 = "/Users/chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt";
        String newFile = "/Users/chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/new_byte_file";
        String newFile2 = "/Users/chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/new_byte_file2";
        String newFile3 = "/Users/chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/new_byte_file3";
        String newFile4 = "/Users/chrisparker/Documents/CodingNomads/labs" +
                "/online-java-fundamentals/src/labs_examples/input_output/files/new_char_file";

        //1) Demonstrate the usage of at least two additional Byte Streams
        try (SequenceInputStream sis = new SequenceInputStream(new FileInputStream(file_1),
                new FileInputStream(file_2)); PrintWriter pw = new PrintWriter(new FileWriter(newFile))) {
            int i;

            while ((i = sis.read()) != -1) {
                pw.print(i);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }


        String s = "Testing out byte array input stream.";
        byte[] byteArray = s.getBytes();
        ByteArrayInputStream bai = new ByteArrayInputStream(byteArray);
        try (PrintWriter pw = new PrintWriter(new FileWriter(newFile2))) {
            int i;
            while ((i = bai.read()) != -1) {
                pw.print(i);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        //2) Demonstrate the usage of at least two additional Character Streams
        char[] charArray = {'a','e','i','o','u'};
        CharArrayReader car = new CharArrayReader(charArray);
        System.out.println(car.toString());

        String s2 = "Testing out StringReader";
        StringReader sr = new StringReader(s2);
        System.out.println(sr.toString());

        //3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
        try (BufferedReader br = new BufferedReader(new FileReader(file_1))) {
            String temp;
            while((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            } catch (IOException exc) {
                exc.printStackTrace();
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file_1))) {
            int j;
            while ((j = bis.read()) != -1) {
                System.out.println(j);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        //4) Demonstrate the use of the DataInputStream and DataOutputStream
        byte[] b;
        try (DataInputStream dis = new DataInputStream((new FileInputStream(file_3)));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(newFile4))) {
                dos.write(dis.readAllBytes());
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}