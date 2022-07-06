public class LargestFloorArea extends LargestBuilding {

    public LargestFloorArea(String name, String country, String city) {
        super(name, country, city);
        //TODO Auto-generated constructor stub
    }

    double floorArea;

    public LargestFloorArea(String name, String country, String city, double floorArea) {
        super(name, country, city);
        this.floorArea = floorArea;
    }
    
    
}
