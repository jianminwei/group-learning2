package grouplearning.springboot.jdbctemplate;

import grouplearning.springboot.jdbctemplate.model.Book;
import grouplearning.springboot.jdbctemplate.repository.JdbcBookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JdbctemplateApplication  {

	public static void main(String[] args) {
		SpringApplication.run(JdbctemplateApplication.class, args);
	}
}