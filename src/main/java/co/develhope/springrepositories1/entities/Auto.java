package co.develhope.springrepositories1.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String modello;

    @Column(nullable = false)
    private int numeroDiSerie;

    private int prezzo;

    public Auto() {
    }

    public Auto(long id, String modello, int numeroDiSerie, int prezzo) {
        this.id = id;
        this.modello = modello;
        this.numeroDiSerie = numeroDiSerie;
        this.prezzo = prezzo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroDiSerie() {
        return numeroDiSerie;
    }

    public void setNumeroDiSerie(int numeroDiSerie) {
        this.numeroDiSerie = numeroDiSerie;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}