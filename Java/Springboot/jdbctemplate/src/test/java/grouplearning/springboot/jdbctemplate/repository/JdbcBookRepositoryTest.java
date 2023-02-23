package grouplearning.springboot.jdbctemplate.repository;

import grouplearning.springboot.jdbctemplate.JdbctemplateApplication;
import grouplearning.springboot.jdbctemplate.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JdbcBookRepositoryTest {
    private static final Logger log = LoggerFactory.getLogger(JdbctemplateApplication.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private JdbcBookRepository bookRepository;

    @BeforeEach
    void init() {
        log.info("Delete BOOK table contents...");
        jdbcTemplate.execute("DELETE FROM BOOK");

        List<Book> books = Arrays.asList(
                new Book(1L,"Thinking in Java", new BigDecimal("37.32")),
                new Book(2L,"Spring Boot in Action", new BigDecimal("39.99")),
                new Book(3L,"Learn JavaScript", new BigDecimal("47.3")),
                new Book(4L,"Learn Angular", new BigDecimal("41.19"))
        );

        books.forEach(book -> {
            log.info("Saving...{}", book.getName());
            bookRepository.save(book);
        });
    }

    @Test
    void count() {
        assertEquals(4, bookRepository.count(), () -> "The book count should be 4");
    }

    @Test
    void update() {
        Book book = bookRepository.findById(2L);
        log.info("[UPDATE] :2L :99.99");
        book.setPrice(new BigDecimal("99.99"));
        log.info("rows affected: {}", bookRepository.update(book));

        book = bookRepository.findById(2L);
        log.info("rows affected: {}", book);
    }

    @Test
    void deleteById() {
        log.info("[DELETE] :3L");
        log.info("rows affected: {}", bookRepository.deleteById(3L));
    }

    @Test
    void findAll() {
        log.info("[FIND_ALL] {}", bookRepository.findAll());
    }

    @Test
    void findAllRowMapper() {
        // find all rowMapper
        log.info("[FIND_ALL row Mapper] {}", bookRepository.findAllRowMapper());
    }

    @Test
    void findById() {
        log.info("[FIND_BY_ID] :2L");
        Book book = bookRepository.findById(2L);
        log.info("{}", book);
    }

    @Test
    void findByNameAndPrice() {
        // find by name (like) and price
        log.info("[FIND_BY_NAME_AND_PRICE] : like '%Java%' and price <= 40");
        log.info("{}", bookRepository.findByNameAndPrice("Java", new BigDecimal(40)));
    }

    @Test
    void getNameById() {
        // get name (string) by id
        log.info("[GET_NAME_BY_ID] :1L = {}", bookRepository.getNameById(1L));
    }
}