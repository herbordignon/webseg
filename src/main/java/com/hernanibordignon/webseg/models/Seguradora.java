package com.hernanibordignon.webseg.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "SEGURADORAS")
@SequenceGenerator(name = "seguradora_seq", allocationSize = 1,
        sequenceName = "SEGURADORA_SEQ")
public class Seguradora implements Entidade {
    
    @Id
    @Column(name = "ID_SEGURADORA")
    @GeneratedValue(generator = "seguradora_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull(message = "{Seguradora.cnpj.NotNull}")
    @Size(min = 14, max = 20, message = "{Seguradora.cnpj.Size}")
    @Column(name = "NR_CNPJ", length = 20)
    private String cnpj;
    @NotNull
    @Size(min = 5, max = 80)
    @Column(name = "NM_SEGURADORA", length = 80)
    private String nome;
    @NotNull
    @Size(min = 5, max = 80)
    @Column(name = "RS_SEGURADORA", length = 80)
    private String razao;
    @Column(name = "NR_TELEFONE", length = 20)
    private String telefone;
    @Email
    @Column(name = "DS_EMAIL", length = 120)
    private String email;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
}
