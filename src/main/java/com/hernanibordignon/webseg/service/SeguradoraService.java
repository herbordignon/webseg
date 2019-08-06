package com.hernanibordignon.webseg.service;

import com.hernanibordignon.webseg.models.Seguradora;
import com.hernanibordignon.webseg.utils.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class SeguradoraService extends AbstractService<Seguradora> {

    @Inject
    private GenericDao<Seguradora> dao;
    
    @Override
    protected GenericDao<Seguradora> getDao() {
        return dao;
    }

}
