package de.akdb.oesio.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class DeleteUser {
    public static void main(String[] args){
        Client client = ClientBuilder.newClient();
        WebTarget myResource = client.target("http://localhost:8080/rest/resource");
        Response response = myResource.request(MediaType.TEXT_PLAIN)
                .delete(Response.class);
        System.out.println(response.getStatus());
    }
}
