
//building can be added without installation (pre inspection)
public class Building {
    //Data assumes australia as the country
    //Basic data for a building
    private int unitNumber;
    private String address;
    private int postcode;
    private String suburb;
    private String city;
    private String state;

    //less basic data
    
    //if the building has a name or is asociated with a business
    //example empire state building
    //or fbi headquarters
    private String buildingName;
    private int rooms;
    private String notes;
    //Building type apartment, house, commercial, industrial ect. 
    private String buildingType;

    
    //constructors
    
    //Default constructor
    Building()
    {
        //creates a blank building object
        unitNumber = 0;
        address = "";
        postcode = 0;
        suburb = "";
        city = "";
        state = "";
        buildingName = "";
        rooms = 0;
        notes = "";
        buildingType = "";
    }
    //no parameterised constructor will be created because data can be entered in any order
    
}
