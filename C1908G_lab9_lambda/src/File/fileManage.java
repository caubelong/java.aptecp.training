package File;

import lab9_labda_Person.Person;

import java.io.*;
import java.util.ArrayList;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class fileManage {
    private ArrayList<Person> persons = new ArrayList<>();
    public static String filePath="C:\\temp\\lab 9\\person_list.txt";
    public ArrayList<Person> readFormFile(){
        try{
                persons.clear();
                File file = new File(filePath);
                BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
                String line;
                int count=0;
                while((line=bufferedReader.readLine()) !=null){
                    System.out.println("haha");
                    count++;
                    if(count != 1){
                      Person person = Person.createObjectFormString(line);
                      if(person != null){
                          persons.add(person);
                      }
                    }
                }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            return persons;
        }
    }

    public void sortByFirstNameASC(){
        persons.sort(( s1, s2) ->{
           return s1.getFirstName().compareTo(s2.getFirstName());
        });
        System.out.println(" Sort First Name is ASC : ");
        for(Person person : persons){
            System.out.println(person);
        }
    }

    public void sortByLastNameDESC(){
        persons.sort(( s1, s2) ->{
            return  s2.getLastName().compareTo(s1.getLastName());
        });
        System.out.println(" Sort Last Name is DESC : ");
        for(Person person : persons){
            System.out.println(person);
        }
    }

    public void sortByAgeDESC(){
        persons.sort((s1,s2)->{
            return Integer.valueOf(s2.getAge()).compareTo(s1.getAge());
        });
        System.out.println(" Sort Age is DESC : ");
        for(Person person : persons){
            System.out.println(person);
        }
    }

    public void findAge1968() {
        ArrayList<Person> result
                = (ArrayList<Person>)persons.stream()
                .filter(item -> item.getBirthYear() > 1968)
                .collect(Collectors.toList());
        if(result == null || result.isEmpty()){
            System.out.println(" khong tim thay ");
            return ;
        }
        System.out.println(" Danh sach person co birth year sau 1968 : ");
        for(Person item : result){
            System.out.println((item.toString()));
        }
    }

    public void perSonFromVietNam(){
        ArrayList<Person> result
                =(ArrayList<Person>)persons.stream()
                .filter(item -> item.getCountry().equalsIgnoreCase("Vietnam"))
                .collect(Collectors.toList());
        if(result == null || result.isEmpty()){
            System.out.println(" khong tim thay ");
            return ;
        }
        System.out.println("person den tu Viet Nam la : ");
        for(Person item : result){
            System.out.println(item.toString());
        }
    }

    public void perSonAge40(){
        ArrayList<Person> result
                =(ArrayList<Person>)persons.stream()
                .filter(item -> item.getAge() >40)
                .collect(Collectors.toList());
        if(result==null || result.isEmpty()){
            System.out.println("khong tim thay ");
            return;
        }
        System.out.println(" person tren 40 tuoi la : ");
        for(Person item : result){
            System.out.println(item.toString());
        }
    }

    public void personJapan30(){
        ArrayList<Person> result
                =(ArrayList<Person>)persons.stream()
                .filter(item -> item.getAge() >40)
                .filter(item -> item.getCountry().equalsIgnoreCase("Japan"))
                .collect(Collectors.toList());
        if(result==null || result.isEmpty()){
            System.out.println("khong tim thay");
            return ;
        }
        System.out.println("person tren 40 tuoi va den tu Japan la : ");
        for(Person item :result){
            System.out.println(item.toString());
        }
    }

    public  void personlastNameLong(){
        int count =0;
        int maxCount =0;
       for(int i=0;i<persons.size();i++){
           count=persons.get(i).getLastName().length();
           if(count>= maxCount ){
               maxCount = count;
               System.out.println("kk");
           }
       }
        int finalMaxCount = maxCount;
        ArrayList<Person> result = (ArrayList<Person>)persons.stream()
                .filter(item -> item.getLastName().length() == finalMaxCount)
                .collect(Collectors.toList());
        System.out.println(" person co last name dai nhat : ");
        for(Person item : result){
            System.out.println(item.toString());
        }

    }

    public void personOld(){
        int count =0;
        int maxCount =0;
        for(int i=0;i<persons.size();i++){
            count=persons.get(i).getAge();
            if(count>= maxCount ){
                maxCount = count;
                System.out.println("kk");
            }
        }
        int finalMaxCount = maxCount;
        ArrayList<Person> result = (ArrayList<Person>)persons.stream()
                .filter(item -> item.getAge() == finalMaxCount)
                .collect(Collectors.toList());
        System.out.println(" person co tuoi lon nhat la :  ");
        for(Person item : result){
            System.out.println(item.toString());
        }
    }

    public void personYoung(){
        int count =0;
        int minCount =1000;
        for(int i=0;i<persons.size();i++){
            count=persons.get(i).getAge();
            if(count<= minCount ){
                minCount = count;
                System.out.println("kk");
            }
        }
        int finalMinCount = minCount;
        ArrayList<Person> result = (ArrayList<Person>)persons.stream()
                .filter(item -> item.getAge() == finalMinCount)
                .collect(Collectors.toList());
        System.out.println(" person co tuoi tre nhat la :  ");
        for(Person item : result){
            System.out.println(item.toString());
        }
    }

    public void sumAgeMen(){
        Integer AgeSum;
        AgeSum=persons.stream()
                .filter(item -> item.getGender().equalsIgnoreCase("Male"))
                .mapToInt(item ->item.getAge())
                .sum();
        System.out.println(" tong tuoi cua person gioi tinh la nam = " + AgeSum);
    }
    public void sumAgeFeMaleUsa(){
        Integer AgeSumFeMale;
        AgeSumFeMale=persons.stream()
                .filter(item -> item.getGender().equalsIgnoreCase("Female"))
                .filter(item -> item.getCountry().equalsIgnoreCase("United States"))
                .mapToInt(item ->item.getAge())
                .sum();
        System.out.println(" tong tuoi cua person nu den tu USA  = " + AgeSumFeMale);
    }

    public void averageAgeVietNam(){
        OptionalDouble averageAgeVn;
        averageAgeVn=persons.stream()
                .filter(item->item.getCountry().equalsIgnoreCase("VietNam"))
                .mapToDouble(item->item.getAge())
                .average();
        double avg= averageAgeVn.isPresent() ? averageAgeVn.getAsDouble() : 0.0d;
        System.out.println(" tuoi trung binh cua Person den tu Viet nam la : " + avg);
    }

    public void maxAgeCountry(){
        System.out.println("nuoc co tong tuoi nam cao nhat la : ");
        Integer AgeVietNam;
        Integer AgeThailand;
        Integer AgeJapan ;
        ArrayList<Integer>age = new ArrayList<>();
        AgeVietNam=persons.stream()
                .filter(item -> item.getGender().equalsIgnoreCase("Male"))
                .filter(item -> item.getCountry().equalsIgnoreCase("VietNam"))
                .mapToInt(item ->item.getAge())
                .sum();
        age.add(AgeVietNam);
        AgeThailand=persons.stream()
                .filter(item -> item.getGender().equalsIgnoreCase("Male"))
                .filter(item -> item.getCountry().equalsIgnoreCase("Thailand"))
                .mapToInt(item ->item.getAge())
                .sum();
        age.add(AgeThailand);
        AgeJapan=persons.stream()
                .filter(item -> item.getGender().equalsIgnoreCase("Male"))
                .filter(item -> item.getCountry().equalsIgnoreCase("Japan"))
                .mapToInt(item ->item.getAge())
                .sum();
        age.add(AgeJapan);
       int result = age.stream().max(Integer::compare).get();
        if(result == age.get(0)){
            System.out.println(" VietNam - " + age.get(0));
        }else if(result==age.get(1)){
            System.out.println(" ThaiLand - " + age.get(1));
        }else {
            System.out.println(" Japan - " + age.get(2));
        }
    }

    public void minCountryFemale(){
        System.out.println("nuoc co tong tuoi nu thap nhat la :");
        Integer ageUSAFeMale;
        Integer ageUNT;
        ArrayList<Integer> ageFemale =new ArrayList<Integer>();
        ageUSAFeMale = persons.stream()
                .filter(item->item.getGender().equalsIgnoreCase("Female"))
                .filter(item->item.getCountry().equalsIgnoreCase("United States"))
                .mapToInt(item->item.getAge())
                .sum();
        ageFemale.add(ageUSAFeMale);
        ageUNT=persons.stream()
                .filter(item-> item.getGender().equalsIgnoreCase("Female"))
                .filter(item->item.getCountry().equalsIgnoreCase("United Kingdom"))
                .mapToInt(item->item.getAge())
                .sum();
        ageFemale.add(ageUNT);
        int result = ageFemale.stream().min(Integer::compare).get();
        if(result == ageFemale.get(0)){
            System.out.println("United States - " + ageFemale.get(0));
        }else{
            System.out.println("United Kingdoom - " + ageFemale.get(1));
        }
    }


}
