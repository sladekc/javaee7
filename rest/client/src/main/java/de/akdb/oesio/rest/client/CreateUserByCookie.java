package de.akdb.oesio.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class CreateUserByCookie {
    public static void main(String[] args){
        Client client = ClientBuilder.newClient();
        WebTarget myResource = client.target("http://localhost:8080/rest/resource");
        Response put = myResource.request(MediaType.TEXT_PLAIN)
                .cookie("user", "Cookie User")
                .put(Entity.text(""));
        System.out.print(put.getStatus());


    }

}
