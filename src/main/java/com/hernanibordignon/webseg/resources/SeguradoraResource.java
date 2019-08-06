package com.hernanibordignon.webseg.resources;

import com.hernanibordignon.webseg.models.Seguradora;
import com.hernanibordignon.webseg.service.AbstractService;
import com.hernanibordignon.webseg.service.SeguradoraService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/seguradoras")
public class SeguradoraResource extends AbstractResource<Seguradora>{

    @Inject
    private SeguradoraService service;

    @Override
    protected AbstractService<Seguradora> getService() {
        return service;
    }
}
