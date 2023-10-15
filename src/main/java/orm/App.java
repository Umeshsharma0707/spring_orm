package orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new ClassPathXmlApplicationContext("orm/config.xml");
       Dao dao = (Dao)ac.getBean("dao");
       User u = new User(1,"java",7845678l,"ahmedabad");
       dao.insertUser(u);
       System.out.println("done");
       
     
       
       
     
    }
}
