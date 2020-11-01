import com.twy.dao.UserMysqlDaoImpl;
import com.twy.dao.UserOrancleDaoImpl;
import com.twy.service.UserService;
import com.twy.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserMysqlDaoImpl());
        userService.getUser();

    }
}
