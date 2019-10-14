package com.siuuu.configuration;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.siuuu.repository")
public class JpaConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPersistenceUnitName("siuuu");
        em.setPackagesToScan("com.siuuu.domain");

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hibernateProperties());
        return em;
    }

    @Bean
    JpaTransactionManager transactionManager (EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://ec2-107-22-160-185.compute-1.amazonaws.com:5432/df2ncvtprc0r0m?sslmode=require");
        dataSource.setUsername("aiomlagxkzuwnl");
        dataSource.setPassword("71093012f1d076ea3b2c5196e7a889918aa12f32403725c31bab95be12109e9f");
        return dataSource;
    }

    Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        return properties;
    }

}
