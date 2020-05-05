/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1a;

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
import java.util.regex.Pattern;


public class test1a_sort {
     public static void main(String[] args) throws IOException {
        test1a_sort.write("C:/temp/lab 7/random_words.txt",
                "C:/temp/lab 7/longest2_word.txt");
    }
    public static void write(String filetoRead2, String filetoWrite2) throws IOException {
        Path read = Paths.get(filetoRead2);
        Path write = Paths.get(filetoWrite2);
        int maxCount2 = 100;
        PrintWriter output2 = null;
        Collection<String> list = new LinkedList<String>();
        try (BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8);
                BufferedReader br1 = Files.newBufferedReader(read, StandardCharsets.UTF_8);
                BufferedWriter bw = Files.newBufferedWriter(write, StandardCharsets.UTF_8)) {
            output2 = new PrintWriter(bw);
            String line = null;
            int count2 = 0;
            while ((line = br.readLine()) != null) {
                count2 = line.toLowerCase().length();
                if (count2 <= maxCount2) {
                    maxCount2 = count2;
                }
            }
            while ((line = br1.readLine()) != null) {
                if (maxCount2 == line.length()) {
                    list.add(line);
                }
            }
            for (String item : list) {
                String str = item;
                Pattern p = Pattern.compile("\\s");
                String[] temp = p.split(str);
                String rev = "";
                for (int i = 0; i < temp.length; i++) {
                    if (i == temp.length - 1)
                       rev = temp[i] + rev;
                    else
                       rev = " " + temp[i] + rev;
                 }
                output2.println("tu ngan nhat la : " + rev);
                System.out.println("sussetfully");
            }
            System.out.println(maxCount2);
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

