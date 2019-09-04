/*
 Created by Caleb Davidson for assignment 2 of Object Oriented Programming
 */
public class Highrise extends Building {
    
    //variables
    private int numOfFloors;
    
    //constructors
    Highrise() {
        numOfFloors = 0;
    }

    Highrise(int NumOfFloors) {
        numOfFloors = NumOfFloors;
    }

    //setters
    void setNumOfFloors(int NumOfFloors) {
        numOfFloors = NumOfFloors;
    }

    //getters
    int getNumOfFloors() {
        return numOfFloors;
    }
}
