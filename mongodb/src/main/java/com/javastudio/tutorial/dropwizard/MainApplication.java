package com.javastudio.tutorial.dropwizard;

import com.javastudio.tutorial.dropwizard.web.resources.ProductsResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MainApplication extends Application<MainConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public void run(MainConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new ProductsResource());
    }
}