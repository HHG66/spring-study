

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCreateMain {

    @Test
   public void testMain(){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");

        Main testMain=(Main) context.getBean("main");
        System.out.println(testMain);
        testMain.main();

    }
}

