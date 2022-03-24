package com.example.jaxrs.conf;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.example.jaxrs.resource.UserResource;

@ApplicationPath("/restapi")
public class ApplicationConfig extends Application {

    private Set< Object> singletons = new HashSet< Object>();

    public ApplicationConfig() {
        singletons.add(new UserResource());
    }

    @Override
    public Set< Object> getSingletons() {
        return singletons;
    }
}
