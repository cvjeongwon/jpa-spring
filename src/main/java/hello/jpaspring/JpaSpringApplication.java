package hello.jpaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)/
@EnableJpaRepositories(basePackages = {"hello.jpaspring.repository"})
@EntityScan(basePackages = {"hello.jpaspring.entity"})
public class JpaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaSpringApplication.class, args);
    }

}
