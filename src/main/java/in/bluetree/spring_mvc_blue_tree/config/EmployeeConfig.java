package in.bluetree.spring_mvc_blue_tree.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.bluetree.spring_mvc_blue_tree")
public class EmployeeConfig {

	@Bean
	public EntityManagerFactory getEntityManagerFactory() {
		
		return Persistence.createEntityManagerFactory("ansari");
		
	}
}
