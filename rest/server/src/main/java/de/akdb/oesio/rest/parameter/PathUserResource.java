package de.akdb.oesio.rest.parameter;

import javax.ws.rs.*;

@Path("/users/{username}")
public class PathUserResource {

    @GET
    @Produces("text/xml")
    public String getUserFromPath(@DefaultValue("Default") @PathParam("username") String userName) {
        return "<user><path-param>"+userName+"</path-param></user>";
    }


}
