import com.twy.config.JavaConfig;
import com.twy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /**
         * XML文件
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringApplicationContext3.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.add();

        /**
         * JavaConfig配置文件
         */
//        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        UserService userService = (UserService) context.getBean("UserServiceImpl");
//        userService.add();
    }
}
