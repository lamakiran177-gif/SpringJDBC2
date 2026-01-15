package a.p;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ac=new ClassPathXmlApplicationContext("a/p/hello.xml");
        Employee1 e = ac.getBean("emp1",Employee1.class);
   
//        Employee eo=new Employee();
//       
//        eo.setId(04);
//        eo.setName("KEIZI");
//        eo.setCity("FUNABASHI");
//        
//        int r = e.intsert(eo);
         
//        System.out.println(r+"data inserted successfully...");
       
//        Employee eo=new Employee();
//        eo.setId(1);
//        eo.setName("TANAKA");
//        eo.setCity("SAITAMA");
//        int r = e.edit(eo);
//        System.out.println(r+"data inserted successfully...");
//        
        
        
        int r = e.delete(1);
        System.out.println(r+"data deleted successfully...");
        
    }
}
