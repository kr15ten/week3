package za.ac.cput.kristen.week3exercise2;

import java.util.Map;

/**
 * Created by student on 2015/02/19.
 */
public class StudentDutiesImpl implements StudentDuties
{
    @Override
    public Map<String, Boolean> getHandIn(Map<String, Boolean> values)
    {
        values.put("Pie", true);
        return values;
    }


    @Override
    public String reverseName(String name, String lName)
    {
        return lName + " " + name;
    }
}
