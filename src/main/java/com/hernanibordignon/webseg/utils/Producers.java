package com.hernanibordignon.webseg.utils;

import com.hernanibordignon.webseg.models.Entidade;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Producers {
    
    @Produces
    @PersistenceContext
    private EntityManager em;
    
    @Produces
    @Dependent
    public <T extends Entidade> GenericDao<T> produceDao(EntityManager em, InjectionPoint ip) {
        Type[] args = ((ParameterizedType)ip.getType()).getActualTypeArguments();
        if (args.length == 0)
            throw new IllegalArgumentException("O GenericDao precisa de um tipo");
        Class<T> type = (Class<T>) args[0];
        return new GenericDao(em, type);
    } 
    
}
