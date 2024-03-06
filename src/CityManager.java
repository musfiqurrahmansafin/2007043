import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * Manages operations on cities, including adding, deleting, counting, and sorting.
 */
public class CityManager{
    private List<City>cityList=new ArrayList<>();
    /**
     * Deletes a city from the list. If the city does not exist, throws a NoSuchElementException.
     *
     * @param city the city to delete
     * @throws NoSuchElementException if the city does not exist in the list
     */
    public void delete(City city) throws NoSuchElementException{
        if (!cityList.remove(city)) throw new NoSuchElementException("City does not exist.");
    }
    /**
     * Returns the total number of cities in the list.
     *
     * @return the total number of cities
     */
    public int count(){return cityList.size();}
    /**
     * Returns a list of cities sorted based on the specified sortType.
     *
     * @param sortType the type of sorting: "name" for city name, "province" for province name
     * @return a sorted list of cities
     */
    public List<City>getCities(String sortType){
        List<City>sortedList=new ArrayList<>(cityList);
        if("name".equalsIgnoreCase(sortType)) sortedList.sort(Comparator.comparing(City::getName));
        else if("province".equalsIgnoreCase(sortType)) sortedList.sort(Comparator.comparing(City::getProvince));
        return sortedList;
    }
    public void addCity(City city){cityList.add(city);}
}
