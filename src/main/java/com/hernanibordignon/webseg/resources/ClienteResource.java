package com.hernanibordignon.webseg.resources;

import com.hernanibordignon.webseg.models.Cliente;
import com.hernanibordignon.webseg.service.AbstractService;
import com.hernanibordignon.webseg.service.ClienteService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }
}
