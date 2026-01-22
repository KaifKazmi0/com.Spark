package InjectionDemo.src.main.java.org.springcore;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;


@Configuration
public class AppConfig {

    @Bean
    @Primary
    public Engine p_engine(){
        return new PetrolEngine();
    }

    @Bean
    @Lazy
    public Car car(){
        return new Car(p_engine());
    }


    @Bean
    public Engine E_engine() {
        return new ElectricEngine();
    }

}
