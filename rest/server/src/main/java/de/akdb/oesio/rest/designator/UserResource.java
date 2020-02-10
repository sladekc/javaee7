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

    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public Response createUserByCookie(@CookieParam("user") String user) {
        this.user = user;

        return Response.created(uriInfo.getAbsolutePath()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserJson() {
        if (user == null) {
            return Response.noContent().build();
        } else {
            return Response.ok(user + " json", MediaType.APPLICATION_JSON).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserXML() {
        if (user == null) {
            return Response.noContent().build();
        } else {
            return Response.ok(user + " xml", MediaType.APPLICATION_XML).build();
        }
    }

    @DELETE
    public Response deleteUser() {
        this.user = null;
        return Response.ok().build();
    }
}
