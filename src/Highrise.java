/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Terry
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
