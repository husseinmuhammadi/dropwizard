package com.javastudio.tutorial.resources;

import com.codahale.metrics.annotation.Timed;
import com.javastudio.tutorial.api.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
    @GET
    @Timed
    public Product find(@QueryParam("id") Long id) {
        return new Product(10L, "Hammer");
    }
}
