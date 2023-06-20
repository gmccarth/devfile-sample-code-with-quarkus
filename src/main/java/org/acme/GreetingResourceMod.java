package org.acme;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-summit")
public class GreetingResourceMod {
    @ConfigProperty(name="SUMMIT_YEAR") String summitYear;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Charlotte RHUG " + summitYear ;
    }
}
