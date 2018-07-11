/*
 * This line is for God!
 * Created by erdong on 2018/7/7 10:05
 * One is Gauss, and another is Évariste Galois.
 */

package ren.erdong.tuils;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

public class DataSourceUtil {

	public static DataSource getDataSource(String driverClass, String url, String user, String password) {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		return dataSource;
	}
}
