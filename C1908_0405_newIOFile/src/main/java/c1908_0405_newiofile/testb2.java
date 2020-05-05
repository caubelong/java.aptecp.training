package c1908_0405_newiofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class testb2 {
    private int currentMaxCount = 0;
    private List<String> lines = new ArrayList<String>();

    public void read(final String filetoRead, final String filetoWrite) throws IOException {
        Path read = Paths.get(filetoRead);
        Path write = Paths.get(filetoWrite);
        PrintWriter output = null;
        try (BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
                BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8)) {
            output = new PrintWriter(bw);
            String line = null;
            while ((line = br.readLine()) != null) {
                int count = (line.split("\\s+")).length;
                if (count > currentMaxCount) {
                    lines.clear();
                    lines.add(line);
                    currentMaxCount = count;
                } else if (count == currentMaxCount) {
                    lines.add(line);
                }
            }
            for (String l : lines) {
                System.out.println(l);
                String str = l;
                Pattern p = Pattern.compile("\\s");
                String[] temp = p.split(str);
                String rev = "";
                for (int i = 0; i < temp.length; i++) {
                    if (i == temp.length - 1)
                       rev = temp[i] + rev;
                    else
                       rev = " " + temp[i] + rev;
                 }
                output.println("cau dai nhat la : " + rev);
                System.out.println("sussetfully");
            }
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        testb2 mdc = new testb2();
        mdc.read("C:/JAVA PROJECT/C1908_0405_newIOFile/src/random_sentences.txt",
                "C:/JAVA PROJECT/C1908_0405_newIOFile/src//result.txt");
    }
}