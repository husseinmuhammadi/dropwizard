package com.javastudio.tutorial;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Properties;

class MainApplicationTest {

    private final Properties properties = new Properties();

    @BeforeEach
    void setUp() throws Exception {
        try (InputStream resource = this.getClass().getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(resource);
        }
    }

    @Test
    void givenApplicationProperties_whenGettingProjectVersion_thenItMustEqualToArtifactVersion() {
        Assertions.assertThat(properties.getProperty("project.version")).contains("SNAPSHOT");
    }
}
