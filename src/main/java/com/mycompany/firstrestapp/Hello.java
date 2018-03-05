package com.mycompany.firstrestapp;

//pataw @Path kai meta cntrl + space gia na kanw import to library javax...

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//it points to this location when I put /hello in my path (e.g. http://localhost:8080/firstRestApp/hello))
@Path("hello")
public class Hello {
    
    //annotation gia to GET. Pali pataw cntrl + space gia na kanw import to GET
    //GET reads the resource - gets input from the user
    
    @GET //what kind of resource is going to come
    @Path("/sayHello")
    @Produces(MediaType.TEXT_XML) //xml format input
    
    //function that executes when my resource type is of XML
    public String sayHello(){
        
        String resource = "<?xml version='1.0'?>" +
                "<hello> Hi Thanos, this is hello from XML </hello>";
        return resource;
    }
    
    @GET //what kind of resource is going to come
    @Path("/sayHelloJASON")
    @Produces(MediaType.APPLICATION_JSON) //JSON format input
    
    //function that executes when my resource type is of JSON
    public String sayHelloJASON(){
        
        String resource = null;
        return resource;
    }
    
    @GET //what kind of resource is going to come
    @Produces(MediaType.TEXT_HTML) //HTML format input
    
    //function that executes when my resource type is of HTML
    public String sayHelloHTML(){
        
        String resource = "<h1> hi thanos, this is hello from HTML</h1>";
        return resource;
    }
}
