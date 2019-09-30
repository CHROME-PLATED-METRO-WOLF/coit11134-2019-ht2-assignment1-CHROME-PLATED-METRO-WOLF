
import java.io.Serializable;

/*
 Created by Caleb Davidson for assignment 2 of Object Oriented Programming
 */
public class Installation implements Serializable {

    private int horsePower;
    private int numZones;
    private int numOutlets;
    //Assume that only one technitian can be assigned to one installation for now.
    public Technician technician;
    public Building building;
    private String startDate;
    private String endDate;

    //Constructors
    Installation() {
        horsePower = 0;
        numZones = 0;
        numOutlets = 0;

    }

    Installation(Technician Technician, Building building1) {
        horsePower = 0;
        numZones = 0;
        numOutlets = 0;
        technician = Technician;
        building = building1;
    }

    Installation(Technician Technician, Building building1, int HorsePower) {
        horsePower = HorsePower;
        numZones = 0;
        numOutlets = 0;
        technician = Technician;
        building = building1;
    }

    Installation(Technician Technician, Building building1, int HorsePower, int NumZones) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = 0;
        technician = Technician;
        building = building1;
    }

    Installation(Technician Technician, Building building1, int HorsePower, int NumZones, int NumOutlets) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = NumOutlets;
        technician = Technician;
        building = building1;
    }

    Installation(Technician Technician, Building building1, int HorsePower, int NumZones, int NumOutlets, String StartDate) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = NumOutlets;
        technician = Technician;
        startDate = StartDate;
        building = building1;
    }

    Installation(Technician Technician, Building building1, int HorsePower, int NumZones, int NumOutlets, String StartDate, String EndDate) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = NumOutlets;
        technician = Technician;
        startDate = StartDate;
        endDate = EndDate;
        building = building1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) horsePower;
        hash = 31 * hash + (int) numZones;
        hash = 31 * hash + (int) numOutlets;
        hash = 31 * hash + technician.hashCode();
        hash = 31 * hash + startDate.hashCode();
        hash = 31 * hash + endDate.hashCode();
        hash = 31 * hash + building.hashCode();
        return hash;
    }

    //Setters
    void setHorsePower(int HorsePower) {
        horsePower = HorsePower;
    }

    void setNumZones(int numberOfZones) {
        numZones = numberOfZones;
    }

    void setBuilding(Building Building1) {
        building = Building1;
    }

    void setOutlets(int numberOfOutlets) {
        numOutlets = numberOfOutlets;
    }

    void setTechnitian(Technician Technician) {
        technician = Technician;
    }

    void setStartDate(String StartDate) {
        startDate = StartDate;
    }

    void setEnddate(String EndDate) {
        endDate = EndDate;
    }

    //Getters
    int getHorsePower() {
        return horsePower;
    }

    int getNumZones() {
        return numZones;
    }

    int getOutlets() {
        return numOutlets;
    }

    String getStartDate() {
        return startDate;
    }

    String getEnddate() {
        return endDate;
    }

    Technician getTechnician() {
        return technician;
    }

    Building getBuilding() {
        return building;
    }

}
