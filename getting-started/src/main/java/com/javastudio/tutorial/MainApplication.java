package com.javastudio.tutorial;

import com.javastudio.tutorial.resources.ProductResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication extends Application<MainConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<MainConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public void run(MainConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new ProductResource());
    }
}
