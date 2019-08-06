package com.hernanibordignon.webseg.models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "APOLICES")
@SequenceGenerator(name = "apolice_seq", allocationSize = 1,
        sequenceName = "APOLICE_SEQ")
public class Apolice implements Entidade {
    
    @Id
    @Column(name = "ID_APOLICE")
    @GeneratedValue(generator = "apolice_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(name = "CD_APOLICE", length = 20, unique = true)
    private String codigo;
    
    @ManyToOne()
    @JoinColumn(name = "ID_CLIENTE", 
            foreignKey = 
                    @ForeignKey(name = "FK_APOLICE_CLIENTE", 
                            value = ConstraintMode.CONSTRAINT))
    private Cliente cliente;
    
    @ManyToOne()
    @JoinColumn(name = "ID_SEGURADORA", 
            foreignKey = 
                    @ForeignKey(name = "FK_APOLICE_SEGURADORA", 
                            value = ConstraintMode.CONSTRAINT))
    private Seguradora seguradora;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VIG")
    private Date vigenciaini;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIM_VIG")
    private Date vigenciafim;
    
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Seguradora getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public Date getVigenciaini() {
        return vigenciaini;
    }

    public void setVigenciaini(Date vigenciaini) {
        this.vigenciaini = vigenciaini;
    }

    public Date getVigenciafim() {
        return vigenciafim;
    }

    public void setVigenciafim(Date vigenciafim) {
        this.vigenciafim = vigenciafim;
    }
}
