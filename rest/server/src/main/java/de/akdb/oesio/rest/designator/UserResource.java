package de.akdb.oesio.rest.designator;


import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/resource")
public class UserResource {
    private static String user;
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public Response createUser(@FormParam("user") String user) {
        this.user = user;

        return Response.created(uriInfo.getAbsolutePath()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser() {
        if (user == null) {
            return Response.noContent().build();
        } else {
            return Response.ok(user, MediaType.APPLICATION_JSON).build();
        }
    }

    @DELETE
    public Response deleteUser() {
        this.user = null;
        return Response.ok().build();
    }
}
