package com.hernanibordignon.webseg.service;

import com.hernanibordignon.webseg.models.Apolice;
import com.hernanibordignon.webseg.utils.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ApoliceService extends AbstractService<Apolice> {

    @Inject
    private GenericDao<Apolice> dao;
    
    @Override
    protected GenericDao<Apolice> getDao() {
        return dao;
    }
    
}
