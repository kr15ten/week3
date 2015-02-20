package za.ac.cput.kristen.week3exercise2.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.kristen.week3exercise2.StudentDuties;
import za.ac.cput.kristen.week3exercise2.StudentDutiesImpl;
import za.ac.cput.kristen.week3exercise2.StudentDutiesImpl2;

/**
 * Created by student on 2015/02/19.
 */
@Configuration
public class AppConfig
{
    @Bean(name="duties")
    public StudentDuties getBean()
    {
        return new StudentDutiesImpl();
    }

    @Bean(name="bean2")
    public StudentDuties getBean2()
    {
        return new StudentDutiesImpl2();
    }
}
