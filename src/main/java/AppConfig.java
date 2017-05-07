import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Admin on 07-05-2017.
 */

@Configuration
@ComponentScan({"com.dy"})
@PropertySource("app.properties")
public class AppConfig {


    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
////        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
////        customerService.setCustomerRepository(getCustomerRepository());
//        return customerService;
//    }

//
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
}
