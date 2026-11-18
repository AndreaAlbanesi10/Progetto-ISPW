package model.roster;

import model.utente.giocatore.Giocatore;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRoster {

    List<Giocatore> giocatori;

    protected AbstractRoster(){
        this.giocatori = new ArrayList<Giocatore>();
    }

    public List<Giocatore> getGiocatori() {
        return giocatori;
    }

    public abstract boolean isCompleto();

    public  void aggiungiGiocatore(Giocatore g){
        //da implementare anche con RosterCompletoExpetion
    };

}
