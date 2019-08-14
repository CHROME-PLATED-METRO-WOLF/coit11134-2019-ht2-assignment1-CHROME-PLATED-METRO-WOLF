
import java.util.Date;


public class Installation extends Building {

    private int horsePower;
    private int numZones;
    private int numOutlets;
    //Assume that only one technitian can be assigned to one installation for now.
    private Technician technician;
    private Date startDate;
    private Date endDate;

    //Constructors
    Installation(Technician Technician) {
        horsePower = 0;
        numZones = 0;
        numOutlets = 0;
        technician = Technician;
    }

    Installation(Technician Technician, int HorsePower) {
        horsePower = HorsePower;
        numZones = 0;
        numOutlets = 0;
        technician = Technician;
    }

    Installation(Technician Technician, int HorsePower, int NumZones) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = 0;
        technician = Technician;
    }

    Installation(Technician Technician, int HorsePower, int NumZones, int NumOutlets) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = NumOutlets;
        technician = Technician;
    }
    Installation(Technician Technician, int HorsePower, int NumZones, int NumOutlets, Date StartDate) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = NumOutlets;
        technician = Technician;
        startDate = StartDate;
    }
    Installation(Technician Technician, int HorsePower, int NumZones, int NumOutlets, Date StartDate, Date EndDate) {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = NumOutlets;
        technician = Technician;
        startDate = StartDate;
        endDate = EndDate;
    }

    //Setters
    void setHorsePower(int HorsePower) {
        horsePower = HorsePower;
    }

    void setNumZones(int numberOfZones) {
        numZones = numberOfZones;
    }

    void setOutlets(int numberOfOutlets) {
        numOutlets = numberOfOutlets;
    }

    void setTechnitian(Technician Technician) {
        technician = Technician;
    }
    void setStartDate(Date StartDate)
    {
        startDate = StartDate;
    }
    void setEnddate(Date EndDate)
    {
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
    
    Date getStartDate()
    {
        return startDate;
    }
    Date getEnddate()
    {
        return endDate;
    }
}
