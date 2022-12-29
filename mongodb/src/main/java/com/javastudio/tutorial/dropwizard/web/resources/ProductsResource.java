package com.javastudio.tutorial.dropwizard.web.resources;

import com.javastudio.tutorial.dropwizard.web.model.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("/products")
public class ProductsResource {

    @GET
    public List<Product> findAll(@QueryParam("name") String name){
        return List.of(new Product(1L, "Computer"));
    }
}
