
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
    //may consider using optional class
    
    @Override
    public String toString()
    {
        return "Unit Number: " + unitNumber + "\n" + "Address: " + address + "\n" + "Suburb: " + suburb
                + "\n" + "Postcode: " + postcode + "\n" + "City: " + city + "\n" + "State: " + state + "\n"
                + "BuildingName: " + buildingName + "\n" + "Rooms: " + rooms + "\n" + "Notes: " + notes + "\n"
                + "Building Type: " + buildingType; 
    }
    
    //setters
    void setUnitNumber(int number)
    {
     unitNumber = number;   
    }
    void setAddress(String Address)
    {
       address = Address; 
    }
    void setPostCode(int code)
    {
        postcode = code;
    }
    void setSuburb(String Suburb)
    {
        suburb = Suburb;
    }
    void setCity(String cityName)
    {
        city = cityName;
    }
    void setState(String State)
    {
        state = State;
    }
    void setBuildingName(String BuildingName)
    {
        buildingName = BuildingName;
    }
    void setRooms(int numOfRooms)
    {
        rooms = numOfRooms;
    }
    void setNotes(String note)
    {
        notes = note;
    }
    void setBuildingType(String BuildingType)
    {
        buildingType = BuildingType;
    }
    
    //Getters
    int setUnitNumber()
    {
     return unitNumber;   
    }
    String setAddress()
    {
       return address; 
    }
    int setPostCode()
    {
        return postcode;
    }
    String setSuburb()
    {
        return suburb;
    }
    String setCity()
    {
        return city;
    }
    String setState()
    {
       return state;
    }
    String setBuildingName()
    {
        return buildingName;
    }
    int setRooms()
    {
        return rooms;
    }
    String setNotes()
    {
        return notes;
    }
    String setBuildingType()
    {
        return buildingType;
    }
    
}
