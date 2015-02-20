package za.ac.cput.kristen.week3exercise2;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private static StudentDuties duty;
    private static Map map;


    @BeforeClass
    public static void beforeClass()
    {
        duty = new StudentDutiesImpl();
        map = new HashMap<String, Boolean>();
        map.put("Pie", false);
    }

    @Before
    public void before()
    {

    }

    @AfterClass
    public static void tearDownOnce()
    {

    }

    public AppTest()
    {

    }


    @org.junit.Test
    public void testHandIn()
    {
        assertTrue(duty.getHandIn(map).get("Pie"));
    }

    @org.junit.Test
    public void testUniversityStudent()
    {
        assertEquals("Helen Paul", duty.reverseName("Paul", "Helen"));
    }
}
