package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.ServersConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//会把ServersConfig加到Spring容器，使用这个注解，无需在ServersConfig类上加@Component
@EnableConfigurationProperties(ServersConfig.class)
public class Springboot06ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidDataSource;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot06ConfigurationApplication.class, args);
        ServersConfig bean = run.getBean(ServersConfig.class);
        DruidDataSource bean2 = run.getBean(DruidDataSource.class);
        System.out.println(bean2);
        System.out.println(bean2.getDriverClassName());
    }

}
