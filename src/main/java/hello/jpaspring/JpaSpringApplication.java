package hello.jpaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JpaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaSpringApplication.class, args);
    }

}
