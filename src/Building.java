/*
 Created by Caleb Davidson for assignment 2 of Object Oriented Programming
 */
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
    Building() {
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

    Building(int UnitNumber) {
        unitNumber = UnitNumber;
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

    Building(int UnitNumber, String Address) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = 0;
        suburb = "";
        city = "";
        state = "";
        buildingName = "";
        rooms = 0;
        notes = "";
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = "";
        city = "";
        state = "";
        buildingName = "";
        rooms = 0;
        notes = "";
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode, String Suburb) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = Suburb;
        city = "";
        state = "";
        buildingName = "";
        rooms = 0;
        notes = "";
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode, String Suburb, String City) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = Suburb;
        city = City;
        state = "";
        buildingName = "";
        rooms = 0;
        notes = "";
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode, String Suburb, String City, String State) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = Suburb;
        city = City;
        state = State;
        buildingName = "";
        rooms = 0;
        notes = "";
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode, String Suburb, String City, String State, String BuildingName) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = Suburb;
        city = City;
        state = State;
        buildingName = BuildingName;
        rooms = 0;
        notes = "";
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode, String Suburb, String City, String State, String BuildingName, int Rooms) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = Suburb;
        city = City;
        state = State;
        buildingName = BuildingName;
        rooms = Rooms;
        notes = "";
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode, String Suburb, String City, String State, String BuildingName, int Rooms, String Notes) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = Suburb;
        city = City;
        state = State;
        buildingName = BuildingName;
        rooms = Rooms;
        notes = Notes;
        buildingType = "";
    }

    Building(int UnitNumber, String Address, int PostCode, String Suburb, String City, String State, String BuildingName, int Rooms, String Notes, String BuildingType) {
        unitNumber = UnitNumber;
        address = Address;
        postcode = PostCode;
        suburb = Suburb;
        city = City;
        state = State;
        buildingName = BuildingName;
        rooms = Rooms;
        notes = Notes;
        buildingType = BuildingType;
    }

    @Override
    public String toString() {
        return "Unit Number: " + unitNumber + "\n" + "Address: " + address + "\n" + "Suburb: " + suburb
                + "\n" + "Postcode: " + postcode + "\n" + "City: " + city + "\n" + "State: " + state + "\n"
                + "BuildingName: " + buildingName + "\n" + "Rooms: " + rooms + "\n" + "Notes: " + notes + "\n"
                + "Building Type: " + buildingType;
    }

    //setters
    void setUnitNumber(int number) {
        unitNumber = number;
    }

    void setAddress(String Address) {
        address = Address;
    }

    void setPostCode(int code) {
        postcode = code;
    }

    void setSuburb(String Suburb) {
        suburb = Suburb;
    }

    void setCity(String cityName) {
        city = cityName;
    }

    void setState(String State) {
        state = State;
    }

    void setBuildingName(String BuildingName) {
        buildingName = BuildingName;
    }

    void setRooms(int numOfRooms) {
        rooms = numOfRooms;
    }

    void setNotes(String note) {
        notes = note;
    }

    void setBuildingType(String BuildingType) {
        buildingType = BuildingType;
    }

    //Getters
    int getUnitNumber() {
        return unitNumber;
    }

    String getAddress() {
        return address;
    }

    int getPostCode() {
        return postcode;
    }

    String getSuburb() {
        return suburb;
    }

    String getCity() {
        return city;
    }

    String getState() {
        return state;
    }

    String getBuildingName() {
        return buildingName;
    }

    int getRooms() {
        return rooms;
    }

    String getNotes() {
        return notes;
    }

    String getBuildingType() {
        return buildingType;
    }

}
