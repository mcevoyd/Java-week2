public class LargestVolume extends LargestBuilding {

    public LargestVolume(String name, String country, String city) {
        super(year, name, country, city);
        //TODO Auto-generated constructor stub
    }
    static int year;
    double volume;
    public LargestVolume(int rank, String name, String country, String city, int year, double volume) {
        super(rank, name, country, city);
        this.year = year;
        this.volume = volume;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "LargestVolume [volume=" + volume + ", year=" + year + "]";
    }

    
    
}
