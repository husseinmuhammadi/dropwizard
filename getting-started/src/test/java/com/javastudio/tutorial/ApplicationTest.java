package com.javastudio.tutorial;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class MainApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(MainApplicationTest.class);

    private static Properties properties = new Properties();

    @BeforeAll
    static void beforeAll() {
        try (InputStream resource = MainApplication.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(resource);
        } catch (IOException e) {
            logger.info("Error loading application properties", e);
        }
    }

    @Test
    void givenApplicationProperties_whenGettingProjectVersion_thenItMustEqualToArtifactVersion() {
        logger.info("Project version: {}", properties.getProperty("project.version"));
        Assertions.assertThat(properties.getProperty("project.version")).contains("SNAPSHOT");
    }
}