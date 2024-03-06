/**
 * Represents a city with a name and province.
 */
public class City {
    private String name;
    private String province;

    /**
     * Constructs a new City with the specified name and province.
     *
     * @param name the name of the city
     * @param province the province of the city
     */
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the name of the city
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the province of the city.
     *
     * @return the province of the city
     */
    public String getProvince() {
        return province;
    }

    // You might need to override equals() and hashCode() methods for proper comparison in collections
}
