package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("contact 1 =>" + contactRepository.getById(1));
        logger.info("contact 2 =>" + contactRepository.getById(2));
        logger.info("contact 3 =>" + contactRepository.getById(3));
        logger.info("contact 1 =>" + contactRepository.getById(1));
        logger.info("contact 1 =>" + contactRepository.getById(1));
    }
}