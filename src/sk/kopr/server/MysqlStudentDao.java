package sk.kopr.server;

import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlStudentDao {

	private JdbcTemplate jdbcTemplate;

    public MysqlStudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String pridajStudenta(String meno, String priezvisko) {
    	String uuid = UUID.randomUUID().toString();
        jdbcTemplate.update("INSERT INTO student(uuid,meno,priezvisko)"
        		+ " VALUES(?,?,?);",new Object[] {uuid,meno,priezvisko});
    	return uuid;
    }
}
