import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.User;

public class testCreatUser {

    @Test
    public void  testUser(){
        ApplicationContext context= new ClassPathXmlApplicationContext("testSet.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
