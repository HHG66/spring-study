import org.injectMap.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJectMap {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("injectMap.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("student------");
        System.out.println(student);
    }
}
