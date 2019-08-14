//This class will probably extend from user on assignment 2 when data is permenantly saved on disk.
public class Technician {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private short age;
    private String notes;
    
    //Constructors
    Technician()
    {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        age = 0;
        notes = "";
    }
    Technician(String FirstName)
    {
        firstName = FirstName;
        lastName = "";
        phoneNumber = "";
        age = 0;
        notes = "";
    }
    Technician(String FirstName, String LastName)
    {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = "";
        age = 0;
        notes = "";
    }
    Technician(String FirstName, String LastName, String PhoneNumber)
    {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        age = 0;
        notes = "";
    }
    Technician(String FirstName, String LastName, String PhoneNumber, short Age)
    {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        age = Age;
        notes = "";
    }
    Technician(String FirstName, String LastName, String PhoneNumber, short Age, String Notes)
    {
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        age = Age;
        notes = Notes;
    }
}
