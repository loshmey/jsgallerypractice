package com.lo.apps.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Entitet kategorija.
 */
@Entity
@Table(name = "kategorija")
public class Kategorija extends GenerickiEntitet {

    @Column(name = "naziv", nullable = false)
    private String naziv;

    @Column(name = "opis")
    private String opis;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roditeljska_kategorija_id")
    private Kategorija roditeljskaKategorija;

    @OneToMany(mappedBy = "roditeljskaKategorija")
    private List<Kategorija> podkategorijeLista;

    @ManyToMany(mappedBy = "listaKategorija")
    private List<Bukmarker> listaBukmarkera;

    public Kategorija() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Kategorija getRoditeljskaKategorija() {
        return roditeljskaKategorija;
    }

    public void setRoditeljskaKategorija(Kategorija roditeljskaKategorija) {
        this.roditeljskaKategorija = roditeljskaKategorija;
    }

    public List<Kategorija> getPodkategorijeLista() {
        return podkategorijeLista;
    }

    public void setPodkategorijeLista(List<Kategorija> podkategorijeLista) {
        this.podkategorijeLista = podkategorijeLista;
    }

    public List<Bukmarker> getListaBukmarkera() {
        return listaBukmarkera;
    }

    public void setListaBukmarkera(List<Bukmarker> listaBukmarkera) {
        this.listaBukmarkera = listaBukmarkera;
    }
}
