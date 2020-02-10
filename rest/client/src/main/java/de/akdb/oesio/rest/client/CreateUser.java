package de.akdb.oesio.rest.client;

import org.glassfish.jersey.client.ClientResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

public class CreateUser {
    public static void main(String[] args){
        MultivaluedMap formData = new MultivaluedHashMap();
        formData.add("user", "Hans Wurst");

        Client client = ClientBuilder.newClient();
        WebTarget myResource = client.target("http://localhost:8080/rest/resource");
        Response post = myResource.request(MediaType.APPLICATION_FORM_URLENCODED)
                .post(Entity.form(formData));
        System.out.print(post.getStatus());
    }
}
