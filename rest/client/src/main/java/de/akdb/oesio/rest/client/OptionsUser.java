package de.akdb.oesio.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class OptionsUser {
    public static void main(String[] args){
        Client client = ClientBuilder.newClient();
        WebTarget myResource = client.target("http://localhost:8080/rest/resource");
        Response response = myResource.request(MediaType.APPLICATION_JSON)
                .options();
        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));
    }
}

