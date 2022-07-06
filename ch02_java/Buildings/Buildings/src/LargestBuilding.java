public class LargestBuilding {

    String name, country, city;
    int rank;

    public LargestBuilding(int rank, String name, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Largest building : Name = " + name + ". Country = " + country + ". City = " + city;
    }
    
    
}
