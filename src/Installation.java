public class Installation extends Building{
    private int horsePower;
    private int numZones;
    private int numOutlets;
    //could have multiple technitians to one Installation
    private Technician technician;
    
    //
    Installation(Technician Technician)
    {
        horsePower = 0;
        numZones = 0;
        numOutlets = 0;
        technician = Technician;
    }
    Installation(Technician Technician, int HorsePower)
    {
        horsePower = HorsePower;
        numZones = 0;
        numOutlets = 0;
        technician = Technician;
    }
    Installation(Technician Technician, int HorsePower, int NumZones)
    {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = 0;
        technician = Technician;
    }
    Installation(Technician Technician, int HorsePower, int NumZones, int NumOutlets)
    {
        horsePower = HorsePower;
        numZones = NumZones;
        numOutlets = NumOutlets;
        technician = Technician;
    }
}
