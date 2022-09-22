package dev.danvega.h2demo;

import dev.danvega.h2demo.model.Book;
import dev.danvega.h2demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Arrays;

@SpringBootApplication
public class H2DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(H2DemoApplication.class, args);
		Object dataSource = context.getBean("dataSource");
		System.out.println(dataSource);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository) {
		return args -> {
			repository.save(new Book(null,"Spring Boot: Up and Running",328,"Mark Heckler"));
		};
	}

}
