package com.lo.apps.entity;

import javax.persistence.*;
import java.nio.file.Path;

/**
 * Entitet slika.
 */
@Entity
@Table(name = "slika")
public class Slika extends GenerickiEntitet {

    @Column(name = "naziv")
    private String naziv;

    @Column(name = "putanja", nullable = false)
    private String putanja;

    @Column(name = "portret")
    private Boolean portret;

    @ManyToOne
    private Bukmarker bukmarker;

    public Slika() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getPutanja() {
        return putanja;
    }

    public void setPutanja(String putanja) {
        this.putanja = putanja;
    }

    public Boolean isPortret() {
        return portret;
    }

    public void setPortret(Boolean portret) {
        this.portret = portret;
    }

    public Bukmarker getBukmarker() {
        return bukmarker;
    }

    public void setBukmarker(Bukmarker bukmarker) {
        this.bukmarker = bukmarker;
    }
}
