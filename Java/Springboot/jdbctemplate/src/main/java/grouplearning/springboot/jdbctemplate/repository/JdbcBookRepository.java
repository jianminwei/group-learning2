package grouplearning.springboot.jdbctemplate.repository;

import grouplearning.springboot.jdbctemplate.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcBookRepository {

    // Spring Boot will create and configure DataSource and JdbcTemplate
    // To use it, just @Autowired
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from book", Integer.class);
    }

    public int save(Book book) {
        return jdbcTemplate.update(
                "insert into book (id, name, price) values(?,?,?)",
                book.getId(), book.getName(), book.getPrice());
    }

    public int update(Book book) {
        return jdbcTemplate.update(
                "update book set name = ?,  price = ? where id = ?",
                book.getName(), book.getPrice(), book.getId());
    }

    public int deleteById(Long id) {
        return jdbcTemplate.update(
                "delete from book where id = ?",
                id);
    }

    public List<Book> findAll() {
        return jdbcTemplate.query(
                "select * from book",
                (rs, rowNum) -> {
                    return new Book(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getBigDecimal("price")
                    );
                }
        );
    }

    /**
     * Below code demonstrate two things:
     * 1. It defines an anonymous class and instantiate at the same time;
     * 2. Spring RowMapper interface has only one method mapRow(ResultSet rs, int rowNum),
     *    so it is functional interface. It can be replaced by a lambda function, see above findAll().
     */
    public List<Book> findAllRowMapper() {
        return jdbcTemplate.query(
                "select * from book",
                new RowMapper<Book>() {
                    @Override
                    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Book b = new Book();
                        b.setId(rs.getLong("id"));
                        b.setName(rs.getString("name"));
                        b.setPrice(rs.getBigDecimal("price"));
                        return b;
                    }
                }
        );
    }

    // jdbcTemplate.queryForObject, populates a single object
    public Book findById(Long id) {

        return jdbcTemplate.queryForObject(
                "select * from book where id = ?",
                (rs, rowNum) ->
                        new Book(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getBigDecimal("price")
                        ),
                id
        );
    }

    public List<Book> findByNameAndPrice(String name, BigDecimal price) {
        return jdbcTemplate.query(
                "select * from book where name like ? and price <= ?",
                (rs, rowNum) ->
                        new Book(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getBigDecimal("price")
                        ),
                "%" + name + "%", price
        );
    }

    public String getNameById(Long id) {
        return jdbcTemplate.queryForObject(
                "select name from book where id = ?",
                String.class,
                id
        );
    }

}