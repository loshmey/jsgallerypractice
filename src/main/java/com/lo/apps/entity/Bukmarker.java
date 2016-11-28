package com.lo.apps.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Enitet bukmarker.
 */
@Entity
@Table(name = "bukmarker")
public class Bukmarker extends GenerickiEntitet {

    @Column(name = "opis")
    private String opis;

    @ManyToMany
    @JoinTable(name = "bukmarker_kategorija", joinColumns = @JoinColumn(name = "bukmarker_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "kategorija_id", referencedColumnName = "id"))
    private List<Kategorija> listaKategorija;

    @OneToMany
    @JoinTable(name = "bukmarker_slika", joinColumns = @JoinColumn(name = "bukmarker_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "slika_id", referencedColumnName = "id"))
    private List<Slika> slike;

    @Column(name = "omiljen")
    private Boolean omiljen;

    public Bukmarker() {
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<Kategorija> getListaKategorija() {
        return listaKategorija;
    }

    public void setListaKategorija(List<Kategorija> listaKategorija) {
        this.listaKategorija = listaKategorija;
    }

    public List<Slika> getSlike() {
        return slike;
    }

    public void setSlike(List<Slika> slike) {
        this.slike = slike;
    }

    public Boolean isOmiljen() {
        return omiljen;
    }

    public void setOmiljen(Boolean omiljen) {
        this.omiljen = omiljen;
    }
}
