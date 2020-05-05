package c1908_0405_newiofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.LinkedList;
public class test1a {
    public static void main( String[] args) throws IOException {
        test1a.write("C:/JAVA PROJECT/C1908_0405_newIOFile/src/random_words.txt",
                "C:/JAVA PROJECT/C1908_0405_newIOFile/src//longest_word.txt");
    }
    public static void write( String filetoRead2,  String filetoWrite2) throws IOException {
         Path read = Paths.get(filetoRead2);
         Path write = Paths.get(filetoWrite2);
        int maxCount2 = 0;
        PrintWriter output2 = null;
         Collection<String> list = new LinkedList<String>();
        try (BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
                BufferedReader br1 = Files.newBufferedReader(read, StandardCharsets.UTF_8);
                BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8)) {
            output2 = new PrintWriter(bw);
            String line = null;
            int count2=0;
            while ((line = br.readLine()) != null) {
                count2 = line.toLowerCase().length();
                
                if (count2 >= maxCount2) {
                    maxCount2 = count2;
                }
            }
            while ((line = br1.readLine()) != null) {
                if(maxCount2 == line.length()){
                    list.add(line);
                }
            }
            for(String item : list){
                output2.println(" tu dai nhat : " + item + " : " + maxCount2);
                System.out.println("thanh cong");
            }
            System.out.println(maxCount2);
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
        } 
    }