/*
 Created by Caleb Davidson for assignment 2 of Object Oriented Programming
 */
public class Technician {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String notes;

    //Constructors
    Technician() {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        age = 0;
        notes = "";
    }

    Technician(String FirstName) {
        firstName = FirstName;
        lastName = "";
        phoneNumber = "";
        age = 0;
        notes = "";
    }

    Technician(String FirstName, String LastName) {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = "";
        age = 0;
        notes = "";
    }

    Technician(String FirstName, String LastName, String PhoneNumber) {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        age = 0;
        notes = "";
    }

    Technician(String FirstName, String LastName, String PhoneNumber, int Age) {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        age = Age;
        notes = "";
    }

    Technician(String FirstName, String LastName, String PhoneNumber, int Age, String Notes) {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        age = Age;
        notes = Notes;
    }

    //Setters
    void setFirstName(String FirstName) {
        firstName = FirstName;
    }

    void setLastName(String LastName) {
        lastName = LastName;
    }

    void setPhoneNumber(String PhoneNumber) {
        phoneNumber = PhoneNumber;
    }

    void setAge(int Age) {
        age = Age;
    }

    void setNotes(String Notes) {
        notes = Notes;
    }

    //Getters
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    int getAge() {
        return age;
    }

    String getNotes() {
        return notes;
    }
}
