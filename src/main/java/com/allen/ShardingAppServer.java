package com.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.allen")
public class ShardingAppServer
{
    public static void main( String[] args )
    {
        SpringApplication.run(ShardingAppServer.class,args);
    }
}
