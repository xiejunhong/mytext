package com.itheima;



import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration//配置类
public class DataSourceConfiguration {

	@Bean(name="dataSource")
	@ConfigurationProperties(prefix="spring.DataSource.c3p0")
	public DataSource getDateSource(){
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
	
}
