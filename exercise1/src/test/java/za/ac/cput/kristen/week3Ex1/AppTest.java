package za.ac.cput.kristen.week3Ex1;

import junit.framework.Test;
import junit.framework.TestCase;
import org.junit.*;

import java.util.*;


public class AppTest extends TestCase
{
    List<Dog> list;
    Set<Dog> set;
    Map<String, Dog> map;
    Dog troy;

    @Before
    public  void beforeTest()
    {
        list = new ArrayList<Dog>();
        set = new HashSet<Dog>();
        map = new HashMap<String, Dog>();
        troy = new Dog("Troy", "Labrador", 4);

        list.add(troy);
        set.add(troy);
        map.put("puppy", troy);
    }


    public AppTest( String testName )
    {
        super( testName );
    }


    @Test
    public void testList()
    {
        assertEquals("Troy", list.get(i).getName());
    }

    @Test
    public void testSet()
    {
        assertTrue(set.contains(troy));
    }

    @Test
    public void testMap()
    {
        assertEquals("Labrador", map.get("puppy").getBreed());
    }
}
