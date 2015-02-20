package za.ac.cput.kristen.week3exercise2;


import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week3exercise2.Config.AppConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private  StudentDuties duty, otherDuty;
    private  Map map;
    private  ApplicationContext ctx;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        duty = (StudentDuties)ctx.getBean("duties");
        otherDuty = (StudentDuties)ctx.getBean("bean2");
        map = new HashMap<String, Boolean>();
        map.put("Pie", false);
    }

    @AfterClass
    public static void tearDownOnce() throws Exception
    {

    }

    @Test
    public void testHandIn() throws Exception
    {
        Assert.assertTrue(duty.getHandIn(map).get("Pie"));
    }

    @Test
    public void testUniversityStudent() throws Exception
    {
        Assert.assertEquals("Helen Paul", duty.reverseName("Paul", "Helen"));
    }

    @Test
    public void testReverseNameBean2() throws Exception
    {
        Assert.assertEquals("Helen", otherDuty.reverseName("hELEN", "Paul"));
    }
}
