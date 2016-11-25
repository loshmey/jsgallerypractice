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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bukmarker")
    private List<Kategorija> listaKategorija;

    @OneToOne
    @JoinColumn(name = "slika_prednja_id")
    private Slika slikaPrednjeStrane;

    @OneToOne
    @JoinColumn(name = "slika_zadnja_id")
    private Slika slikaZadnjeStrane;

    @Column(name = "omiljen")
    private Boolean omiljen;

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

    public Slika getSlikaPrednjeStrane() {
        return slikaPrednjeStrane;
    }

    public void setSlikaPrednjeStrane(Slika slikaPrednjeStrane) {
        this.slikaPrednjeStrane = slikaPrednjeStrane;
    }

    public Slika getSlikaZadnjeStrane() {
        return slikaZadnjeStrane;
    }

    public void setSlikaZadnjeStrane(Slika slikaZadnjeStrane) {
        this.slikaZadnjeStrane = slikaZadnjeStrane;
    }

    public Boolean getOmiljen() {
        return omiljen;
    }

    public void setOmiljen(Boolean omiljen) {
        this.omiljen = omiljen;
    }
}
