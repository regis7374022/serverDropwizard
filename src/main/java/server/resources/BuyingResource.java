package server.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

/**
 * Created by Рома on 20.03.2017.
 */
@Path("/buy")
@Produces(MediaType.APPLICATION_JSON)
public class BuyingResource {

    @POST
    @Path("/newlist")
    public Response createNewList(HashMap<String, Integer> items) {
        return null;
    }

}
