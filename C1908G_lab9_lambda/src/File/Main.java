package File;

public class Main {
    public static  void main(String[] args ){
        System.out.println("result lab 9 : ");
        fileManage fileManage = new fileManage();
        fileManage.readFormFile();
//        fileManage.sortByFirstNameASC();
        //fileManage.sortByLastNameDESC();
        //fileManage.sortByAgeDESC();
//        fileManage.findAge1968();
//        fileManage.perSonFromVietNam();
//        fileManage.perSonAge40();
//        fileManage.personJapan30();
        //fileManage.personlastNameLong();
        fileManage.personOld();
        fileManage.personYoung();
        fileManage.sumAgeMen();
        fileManage.sumAgeFeMaleUsa();
        fileManage.averageAgeVietNam();
        fileManage.maxAgeCountry();
        fileManage.minCountryFemale();
    }
}
