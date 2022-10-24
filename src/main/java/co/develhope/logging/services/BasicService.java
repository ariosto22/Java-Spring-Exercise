package co.develhope.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BasicService {

    @Autowired
    private Environment environment;

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public int getPow() {
        logger.info(">> INFO logging: getPow() - Starting pow calculation of 2^8");

        int n1 = Integer.parseInt(Objects.requireNonNull(environment.getProperty("customEnvs.n1")));
        int n2 = Integer.parseInt(Objects.requireNonNull(environment.getProperty("customEnvs.n2")));
        int pow = (int) (Math.pow(n1, n2));

        logger.info(">> INFO logging: getPow() - The result is " + pow);
        logger.info(">> INFO logging: getPow() - Finished pow calculation");
        return pow;
    }

}