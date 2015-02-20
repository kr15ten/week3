package za.ac.cput.kristen.week3exercise2;

import java.util.Map;

/**
 * Created by kris on 2/20/15.
 */
public class StudentDutiesImpl2 implements StudentDuties
{

    @Override
    public Map<String, Boolean> getHandIn(Map<String, Boolean> values) {
        return values;
    }

    @Override
    public String reverseName(String name, String lName) {

            return name.toUpperCase().charAt(0) + name.toLowerCase().substring(1);
    }
}
