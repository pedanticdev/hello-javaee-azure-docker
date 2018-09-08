package com.airhacks.ping.boundary;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "Enjoy Java EE 8!";
    }

    @GET
    @Path("{name}")
    public JsonObject greet(@PathParam("name") String name) {
        return Json.createObjectBuilder().add("name", name)
                .add("greeting", "Ohai")
                .add("from", "Java EE in docker on Azure!")
                .build();
    }

}
