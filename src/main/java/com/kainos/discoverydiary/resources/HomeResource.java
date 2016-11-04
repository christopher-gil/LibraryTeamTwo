package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.kainos.discoverydiary.views.Index;

import io.dropwizard.views.View;
import org.glassfish.jersey.server.Uri;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

@Path("")
public class HomeResource {

    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public Response Index() {
        URI uri = UriBuilder.fromUri("/book/list").build();
        return Response.seeOther(uri).build();
    }

}
