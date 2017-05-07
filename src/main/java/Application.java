import com.dy.service.CustomerService;
import com.dy.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Admin on 07-02-2017.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//      CustomerService customerService = new CustomerServiceImpl();
        CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

        System.out.println(customerService);
        CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService2);
        System.out.println(customerService.findAll().get(0).getFirstName());// first element, that we hardcoded, just for testing the happy path
    }
}
