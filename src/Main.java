public class Main {
    public static void main(String[] args) {
        CityManager cityManager = new CityManager();

        // Adding some cities
        cityManager.addCity(new City("Toronto", "Ontario"));
        cityManager.addCity(new City("Vancouver", "British Columbia"));
        cityManager.addCity(new City("Montreal", "Quebec"));

        // Printing count before deletion
        System.out.println("Total cities before deletion: " + cityManager.count());

        // Deleting a city and handling potential exception
        try {
            cityManager.delete(new City("Vancouver", "British Columbia"));
            System.out.println("Vancouver deleted successfully.");
        } catch (NoSuchElementException e) {
            System.out.println("City not found for deletion.");
        }

        // Printing count after deletion
        System.out.println("Total cities after deletion: " + cityManager.count());

        // Sorting and printing cities by name
        System.out.println("Cities sorted by name:");
        cityManager.getCities("name").forEach(city -> System.out.println(city.getName() + ", " + city.getProvince()));

        // Sorting and printing cities by province
        System.out.println("\nCities sorted by province:");
        cityManager.getCities("province").forEach(city -> System.out.println(city.getName() + ", " + city.getProvince()));
    }
}
