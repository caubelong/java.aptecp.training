package lab9_labda_Person;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String country;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender, int birthYear, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.country = country;
    }
    public static Person createObjectFormString(String line){
        // co static vi ham nay phai co truoc khi tao ra doi tuong
        String[] strings= line.split("\\s", 5);
        if(strings.length == 0){
            return null;
        }
        String firstName = strings[0];
        String lastName = strings[1];
        String gender = strings[2];
        int birthYear = Integer.valueOf(strings[3]);
        String country = strings[4];
        return new Person(firstName,lastName,gender,birthYear,country);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getCountry() {
        return country;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getAge(){
        return LocalDate.now().getYear() - this.birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthYear=" + birthYear +
                ", country='" + country + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }
}
