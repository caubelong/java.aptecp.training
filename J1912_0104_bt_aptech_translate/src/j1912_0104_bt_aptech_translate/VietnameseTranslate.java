/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1912_0104_bt_aptech_translate;

public class VietnameseTranslate implements InumberTranslate {

    @Override
    public String getString(int number) {
        switch (number) {
            case 0:
                return "khong";
            case 1:
                return "mot";

            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam ";
            case 9:
                return "chin";
            default:
                return "unknow";
        }
    }

    @Override
    public int getNumber(String str) {
        int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        switch (str.toLowerCase().trim()) {
            case " khong ":
                return numbers[0];
            case " mot ":
                return numbers[1];
            case " hai ":
                return numbers[2];
            case " ba ":
                return numbers[3];
            case " bon ":
                return numbers[4];
            case " nam ":
                return numbers[5];
            case "sau":
                return numbers[6];
            case " bay ":
                return numbers[7];
            case " tam ":
                return numbers[8];
            case " chin ":
                return numbers[9];
            default :
                return -1;
        }
    }

}
