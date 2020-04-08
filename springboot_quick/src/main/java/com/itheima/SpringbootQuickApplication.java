package com.itheima;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.mysql.cj.conf.PropertyKey.logger;

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
