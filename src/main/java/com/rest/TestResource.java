package com.rest;

import com.yammer.metrics.annotation.Timed;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: amarjeet.singh
 * Date: 21/07/14
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/test")
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})

public class TestResource {
    public static int counter=0;
    public TestResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response geResponse() {
        return Response.ok().entity(new College(StudentUtil.getStudents())).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Timed
    public Response getStudent(@PathParam("id") String rollNo){
        Student student=StudentUtil.getStudent(rollNo);
        if(student==null)
            return Response.status(404).build();
        return Response.ok().entity(student).build();
    }



    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(@Valid Student student){
        StudentUtil.addStudent(student);
        return Response.ok().entity("Student Added Successfully").build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testPut(@PathParam("id") final String id) throws InterruptedException {
        Thread.sleep(600000);
        return Response.ok().entity(new HashMap<String, String>() {{
            put("id", id);
        }}).build();
    }
}
