package com.example.configclientmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigclientMasterApplication {
    // spring cloud config参考： https://www.cnblogs.com/li-lun/p/11733967.html
    public static void main(String[] args) {
        SpringApplication.run(ConfigclientMasterApplication.class, args);
    }

}
