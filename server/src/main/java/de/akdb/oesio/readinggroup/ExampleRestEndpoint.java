package de.akdb.oesio.readinggroup;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/bar")
public class ExampleRestEndpoint
{
    @Inject
    private IHalloBean andereBean;

//    @Inject
//    @RequestScoped
//    private IHalloBean readingGroupHallo;

//    @Inject
//    private IHalloBean programaticHallo;

//    @Inject
//    private IHalloBean statusHallo;

    public ExampleRestEndpoint()
    {
    }

    @GET
    @Path("/hans")
    @Produces({ "text/html" })
    public String getHtml()
    {
        return "<html lang=\"en\"><body><h1><ul>"
                + this.li(this.andereBean.hallo())
                + this.li(this.andereBean.hallo2())
//                + this.li(this.readingGroupHallo.hallo())
//                + this.li(this.statusHallo.hallo())
//                + this.li(this.programaticHallo.hallo())
                + "</ul></body></h1></html>";
    }

    private String li(String s)
    {
        return String.format("<li>%s</li>", s);
    }
}