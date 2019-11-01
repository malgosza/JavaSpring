package kodzik.Booki;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
// Config jest jeden dla projektu a nie pakietu
    @Bean
    public Module module() {
        return new Hibernate5Module();
    }
}