/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1912_0104_bt_aptech_translate;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Microsoft Windows
 */
public class FileMangement  {

    public static void savePersonToFile(Person person) {
        try {
            FileOutputStream fileOut = new FileOutputStream("c:\\temp\\file1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);//ngã ở đâu vào catch chỗ đó, VÀ ko làm tiếp nữa
            out.close();//giống chơi Sasuke
            fileOut.close();
            System.out.println("Save to file successfully");
        } catch (Exception e) {
            System.err.println("cannot save to file : " + e.toString());
        } finally {
            // finally luc nao cung vao, loi hay gi cung chay 
            System.out.println("finally ....");
        }

    }
}
