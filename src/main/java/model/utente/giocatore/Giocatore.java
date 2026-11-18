package model.utente.giocatore;


import model.utente.RuoloEnum;
import model.utente.Utente;
import model.valutazione.Valutazione;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;


public class Giocatore extends Utente {

    private LocalDate annoDiNascita;
    private PosizioneEnum posizione;
    private Integer altezza;
    private Integer peso;
    private String immagine;
    private final List<Valutazione> valutazioni;

    public Giocatore(String username, String password, String nome, String cognome, RuoloEnum ruolo, LocalDate annoDiNascita, PosizioneEnum posizione,
                     Integer altezza, Integer peso, String immagine) {

        super(username, password, nome, cognome, ruolo);

        this.annoDiNascita = annoDiNascita;
        this.posizione = posizione;
        this.altezza = altezza;
        this.peso = peso;
        this.immagine = immagine;
        this.valutazioni = new ArrayList<Valutazione>();
    }

    public LocalDate getAnnoDiNascita() {
        return annoDiNascita;
    }

    public void setAnnoDiNascita(LocalDate annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    public PosizioneEnum getPosizione() {
        return posizione;
    }

    public void setPosizione(PosizioneEnum posizione) {
        this.posizione = posizione;
    }

    public Integer getAltezza() {
        return altezza;
    }

    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }


    public void aggiungiValutazione(Valutazione valutazione) {
        this.valutazioni.add(valutazione);
    }
    public void eliminaValutazione(Valutazione valutazione) {
        this.valutazioni.remove(valutazione);
    }



    public Integer eta(){

        return Period.between(annoDiNascita, LocalDate.now(ZoneId.systemDefault())).getYears();

    }

    public int mediaValutazioni(){

        float media = 0;

        if(!valutazioni.isEmpty()) {
            for (Valutazione v : valutazioni) {

                media = media + (float)v.getValore();
            }

            media = media / valutazioni.size();

            return Math.round(media);
        }
        return 0;
    }

}
