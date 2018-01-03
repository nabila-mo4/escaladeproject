package org.myprojects.spring.escaladeproject.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.myprojects.spring.escaladeproject.consumer.contract.dao.SiteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration

@EnableWebMvc
@ComponentScan(basePackages="org.myprojects.spring.escaladeproject")
@PropertySource("classpath:database.properties")
public class WebConfig implements WebMvcConfigurer {
	
	
	
	
	    @Autowired
	    DataSource dataSource;
	 
	    @Bean
	    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
	        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	        //jdbcTemplate.setResultsMapCaseInsensitive(true);
	        return namedParameterJdbcTemplate;
	    }
	 
	@Bean
	public DataSource getDataSource() throws NamingException {
			
		JndiTemplate jndiTemplate= new JndiTemplate();
		DataSource dataSource = (DataSource) jndiTemplate.lookup("java:comp/env/jdbc/escalade");
		
			
			return dataSource;
				
		}


	public void addRessourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
