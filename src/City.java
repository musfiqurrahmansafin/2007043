import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * Tests the functionalities of the CityManager class.
 */
public class CityManagerTest{
    private CityManager manager;
    @Before
    public void setUp(){
        manager=new CityManager();
        manager.addCity(new City("CityA","ProvinceA"));
        manager.addCity(new City("CityB","ProvinceB"));
    }
    @Test
    public void testDelete(){
        City city=new City("CityA","ProvinceA");
        manager.delete(city);
        Assert.assertEquals(1,manager.count());
    }
    @Test(expected=NoSuchElementException.class)
    public void testDeleteException(){
        City city=new City("CityNonExistent","ProvinceNonExistent");
        manager.delete(city);
    }
    @Test
    public void testCount(){
        Assert.assertEquals(2, manager.count());
    }
    @Test
    public void testSort() {
        List<City>sortedByName=manager.getCities("name");
        Assert.assertEquals("CityA",sortedByName.get(0).getName());
        List<City> sortedByProvince=manager.getCities("province");
        Assert.assertEquals("ProvinceA",sortedByProvince.get(0).getProvince());
    }
}
