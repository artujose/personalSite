package com.personalsite.spring;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(Application.class, args);
        
        logger.info("------------------- Beans in the app context  --------------------");
        
        String beanNames[] = appContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        
        for(String beanName:beanNames)
        	logger.info(beanName);
        
        logger.info("------------------- End of Beans in the app context  --------------------");
    }
}