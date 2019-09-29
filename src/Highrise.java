
import java.io.Serializable;

/*
 Created by Caleb Davidson for assignment 2 of Object Oriented Programming
 */
public class Highrise extends Building implements Serializable {
    
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
    @Override
    public int hashCode()
    {
       
        int hash = super.hashCode();
        hash = 31 * hash + (int) numOfFloors;
        return hash;
    }
}
