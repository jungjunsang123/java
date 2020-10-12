package model2;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DataSourceManager2 {
	private static DataSourceManager2 instance = new DataSourceManager2();
	private DataSource ds;
	private DataSourceManager2() {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");		
		ds=dataSource;
	}
	public static DataSourceManager2 getInstance() {
		return instance;
	}
	public DataSource getDataSource() {
		return ds;
	}
}
