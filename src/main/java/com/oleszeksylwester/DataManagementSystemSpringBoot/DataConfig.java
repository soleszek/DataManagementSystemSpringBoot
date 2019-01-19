package com.oleszeksylwester.DataManagementSystemSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

@Configuration
public class DataConfig {

    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/dms?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("Rzeszów1983@");
        return ds;
    }

    @Bean(name = "userDetailsService")
    @Primary
    public UserDetailsService userDetailsService(){
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(dataSource());
        jdbcImpl.setUsersByUsernameQuery(
                "select login, password from User where login=?");
        jdbcImpl.setAuthoritiesByUsernameQuery(
                "select login, role from User_roles where login=?");
        return jdbcImpl;
    }
}
