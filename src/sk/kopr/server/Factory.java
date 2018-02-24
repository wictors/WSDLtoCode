package sk.kopr.server;

import org.springframework.jdbc.core.JdbcTemplate;
import com.mysql.cj.jdbc.MysqlDataSource;

public enum Factory {
	INSTANCE;
	private JdbcTemplate jdbcTemplate;
	private MysqlStudentDao mysqlStudentDao;

	public JdbcTemplate getJdbcTemplate() {
		if (jdbcTemplate == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/projekt2?serverTimezone=UTC");
            dataSource.setUser("klient");
            dataSource.setPassword("kopr");
            jdbcTemplate = new JdbcTemplate(dataSource);
        }
        return jdbcTemplate;     
	}
	
	public MysqlStudentDao getMysqlStudentDao() {
        if (mysqlStudentDao == null) {
            mysqlStudentDao = new MysqlStudentDao(getJdbcTemplate());            
        }
        return mysqlStudentDao;
    }
}
