/*
 Created by Caleb Davidson for assignment 2 of Object Oriented Programming
 */
public class Highrise extends Building {

    private int numOfFloors;

    Highrise() {
        numOfFloors = 0;
    }

    Highrise(int NumOfFloors) {
        numOfFloors = NumOfFloors;
    }

    void setNumOfFloors(int NumOfFloors) {
        numOfFloors = NumOfFloors;
    }

    int getNumOfFloors() {
        return numOfFloors;
    }
}
