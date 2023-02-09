package grouplearning.springboot.demo1;

import grouplearning.springboot.demo1.appcomponents.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);

	@Autowired
	private Person person;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * Springboot has built in logging, and the log levels
		 * can be controlled from the application.properties.
		 */
		log.trace("log trace");
		log.debug("log debug");
		log.info("log info");
		log.warn("log warn");
		log.error("log error");

		/**
		 * Auto-injected objects and everything is wired up.
		 */
		log.info("Person: {}", person);
		log.info("Shirt color: {}", person.getShirt().getColor());
		log.info("Shoe color: {}", person.getShoe().getColor());
	}
}
