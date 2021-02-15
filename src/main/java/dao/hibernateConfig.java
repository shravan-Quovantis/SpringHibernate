//package dao;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//
//@Configuration
//@ComponentScan(basePackages = {"dao"})
//public class hibernateConfig {
//
//    @Bean("driverManagerDataSourceBean")
//    public DriverManagerDataSource managerDataSource{
//        final DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/Quovantis");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("Olivia@83");
//        return driverManagerDataSource;
//    }
//
//    @Bean("seTemplateBean")
//    public LocalSessionFactoryBean getTemplate{
//        final LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
//
//        return localSessionFactoryBean;
//    }
//}
