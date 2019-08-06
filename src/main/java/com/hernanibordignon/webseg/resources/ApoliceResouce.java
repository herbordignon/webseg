package com.hernanibordignon.webseg.resources;

import com.hernanibordignon.webseg.models.Apolice;
import com.hernanibordignon.webseg.service.AbstractService;
import com.hernanibordignon.webseg.service.ApoliceService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/apolices")
public class ApoliceResouce extends AbstractResource<Apolice>{

    @Inject
    private ApoliceService service;
    
    @Override
    protected AbstractService<Apolice> getService() {
        return service;
    }
}
