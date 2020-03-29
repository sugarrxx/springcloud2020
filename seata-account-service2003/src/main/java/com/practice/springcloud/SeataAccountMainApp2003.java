package com.practice.springcloud;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@AllArgsConstructor
@NoArgsConstructor
public class SeataAccountMainApp2003 {
    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMainApp2003.class,args);
    }
}