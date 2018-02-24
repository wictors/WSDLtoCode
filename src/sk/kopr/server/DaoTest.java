package sk.kopr.server;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import junit.framework.Assert;

class DaoTest {

	@Test
	void testPridajStudenta() {
		JdbcTemplate jdbcTemplate = Factory.INSTANCE.getJdbcTemplate();
		MysqlStudentDao daoS = new MysqlStudentDao(jdbcTemplate);
        int pocetPred = jdbcTemplate.queryForInt("select count(*) from student"); 
        String uuid = daoS.pridajStudenta("Jozko", "Kozak");
        int pocetPo = jdbcTemplate.queryForInt("select count(*) from student"); 
        Assert.assertEquals(pocetPred+1, pocetPo);
        jdbcTemplate.update("delete from student where uuid = ?", new Object[] {uuid});
        
	}

}
