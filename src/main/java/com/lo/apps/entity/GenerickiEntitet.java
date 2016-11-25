package com.lo.apps.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Genericki entitet koga prosiruju ostali entiteti.
 */
@MappedSuperclass
public class GenerickiEntitet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Version
    protected Integer verzija;

    @Column(name = "kreirano_dana", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date kreiranoDana;

    @Column(name = "izmenjeno_dana")
    @Temporal(TemporalType.DATE)
    private Date izmenjenoDana;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVerzija() {
        return verzija;
    }

    public void setVerzija(Integer verzija) {
        this.verzija = verzija;
    }

    public Date getKreiranoDana() {
        return kreiranoDana;
    }

    public void setKreiranoDana(Date kreiranoDana) {
        this.kreiranoDana = kreiranoDana;
    }

    public Date getIzmenjenoDana() {
        return izmenjenoDana;
    }

    public void setIzmenjenoDana(Date izmenjenoDana) {
        this.izmenjenoDana = izmenjenoDana;
    }
}
