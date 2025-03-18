import annotation.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
        UserController userController = context.getBean(UserController.class);
        userController.add();
    }


}
