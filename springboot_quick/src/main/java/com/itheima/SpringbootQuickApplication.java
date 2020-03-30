package com.itheima;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableScheduling
public class SpringbootQuickApplication {
    private final static Logger logger = LoggerFactory.getLogger(SpringbootQuickApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(SpringbootQuickApplication.class, args);
logger.debug("de");
        logger.info("dd");

	}

}
