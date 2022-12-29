package com.javastudio.tutorial.web.resources;

import com.codahale.metrics.annotation.Timed;
import com.javastudio.tutorial.web.model.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductsResource {
    @GET
    @Path("{id}")
    @Timed
    public List<Product> findById(@PathParam("id") Long id) {
        if (id!=10)
            return Collections.emptyList();
        return List.of(new Product(10L, "Hammer"));
    }
}
