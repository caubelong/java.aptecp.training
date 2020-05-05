package c1908_0405_newiofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// bai 1 phan b: 
public class test {
    public static void main(final String[] args) throws IOException {
        test.read("C:/JAVA PROJECT/C1908_0405_newIOFile/src/random_words.txt",
                "C:/JAVA PROJECT/C1908_0405_newIOFile/src//vowel_word.txt");
    }

    public static void read(final String filetoRead, final String filetoWrite) throws IOException {
        final Path read = Paths.get(filetoRead);
        final Path write = Paths.get(filetoWrite);
        PrintWriter output = null;
        int maxCount = 0;
        String strLength = null;
        try (BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
                BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8)) {
                    output = new PrintWriter(bw);
            String line = null;
            while ((line = br.readLine()) != null) {
                final String[] arr = line.split("  ");
                for (String item : arr) {
                    int count = 0;
                    item = item.toLowerCase();
                    for (int i = 0; i < item.length(); i++) {
                        final char x = item.charAt(i);
                        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                            count++;
                        }
                    }
                    if (count > maxCount) {
                        maxCount = count;
                        strLength = item;
                    }
                }
            }
            output.println(" word with most vowels is : " + strLength + " : " + maxCount);
            System.out.println("thanh cong");
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
