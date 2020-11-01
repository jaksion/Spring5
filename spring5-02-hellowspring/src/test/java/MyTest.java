import com.twy.pojo.Hellow;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象都在spring中管理了，因此直接取出来就可以使用了
        Hellow hellow = (Hellow) context.getBean("hellow");
        System.out.println(hellow.toString());
    }
}
