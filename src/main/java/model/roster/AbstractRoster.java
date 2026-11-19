package model.roster;

import exception.AppException;
import exception.GiocatoreDuplicatoException;
import exception.RosterPienoException;
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

    public  void aggiungiGiocatore (Giocatore g) throws RosterPienoException, GiocatoreDuplicatoException {

        if(this.giocatori.contains(g)){

            throw new GiocatoreDuplicatoException("giocatore già presente nel roster");
        }

        if(this.isCompleto()){
            throw new RosterPienoException("roster pieno");
        }

        this.giocatori.add(g);

    }

}
