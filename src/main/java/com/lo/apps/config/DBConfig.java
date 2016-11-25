package com.lo.apps.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import java.util.Properties;

/**
 * Konfiguracija za DB.
 */
@Configuration
@EnableTransactionManagement
public class DBConfig {

    @Value("#{'${spring.datasource.url}'.trim()}")
    private String url;

    @Value("#{'${spring.datasource.driverClassName}'.trim()}")
    private String driverClass;

    @Value("#{'${spring.datasource.username}'.trim()}")
    private String username;

    @Value("#{'${spring.datasource.password}'.trim()}")
    private String password;

    @Bean
    JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);

        return transactionManager;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

        em.setPackagesToScan("com.lo.apps.entity");
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());

        return em;
    }

    private Properties additionalProperties() {
        Properties props = new Properties();

        props.setProperty("hibernate.connection.url", url);
        props.setProperty("hibernate.connection.driver_class", driverClass);
        props.setProperty("hibernate.connection.username", username);
        props.setProperty("hibernate.connection.password", password);
        props.setProperty("org.hibernate.envers.store_data_at_delete", "true");

        return props;
    }
}
