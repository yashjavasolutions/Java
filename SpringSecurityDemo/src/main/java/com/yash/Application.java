package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application
{
	private static final Logger LOGGER=LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
		LOGGER.trace("Simple log statement with inputs {}, {} and {}", 1,2,3);
	    LOGGER.debug("Simple log statement with inputs {}, {} and {}", 1,2,3);
	    LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);
	    LOGGER.warn("Simple log statement with inputs {}, {} and {}", 1,2,3);
	    LOGGER.error("Simple log statement with inputs {}, {} and {}", 1,2,3);
		
	}

}
