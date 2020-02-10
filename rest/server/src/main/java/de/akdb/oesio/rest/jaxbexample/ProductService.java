package de.akdb.oesio.rest.jaxbexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductService
{
    @GET
    @Produces({MediaType.APPLICATION_XML})
    public Product getProduct() {
        int price = 12;

        Product product = new Product();
        product.setPrice(price);
        product.setTitle("Hallo");
        return product;
    }
}
