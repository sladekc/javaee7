package de.akdb.oesio.rest.client.jaxbexample;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ProductClient {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget myResource = client.target("http://localhost:8080/rest/product");
        Product response = myResource.request(MediaType.APPLICATION_XML)
                .get(Product.class);

        System.out.println(response.getPrice());
        System.out.println(response.getTitle());
    }
}
