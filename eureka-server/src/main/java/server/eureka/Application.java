package server.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Startup class.
 * @author Kahle
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    /**
     * Program entry.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("Eureka server start success! ");
    }

}
