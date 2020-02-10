package de.akdb.oesio.rest.parameter;

import javax.ws.rs.*;

@Path("/user")
public class QueryUserResource {

    @GET
    @Produces("text/html")
    public String getUserFromQuery(@DefaultValue("Default") @QueryParam("userName") String userName) {
        return "<html><body><h1>"+userName+"</h1></body></html>";
    }
}
