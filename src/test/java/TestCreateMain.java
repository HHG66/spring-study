

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.User;


public class TestCreateMain {
    private Logger logger  =  LoggerFactory.getLogger(TestCreateMain.class);
    @Test

   public void testMain(){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");

        Main testMain=(Main) context.getBean("main");
        System.out.println(testMain);
        testMain.main();
        logger.info("### 执行调用----");
//        User testUser= new User("zhangsan");
//        System.out.println(testUser.getName());
    }
}

