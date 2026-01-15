package s.p;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ac=new ClassPathXmlApplicationContext("s/p/hello.xml");
         JdbcTemplate temp = ac.getBean("jdbcTemplate",JdbcTemplate.class);
    
         String q="insert into Student(id,name,city) values(?,?,?)"; 
         
         int r = temp.update(q,12,"kiran","Tokyo");
         
         System.out.println(r+"record inserted...");
    }
}
