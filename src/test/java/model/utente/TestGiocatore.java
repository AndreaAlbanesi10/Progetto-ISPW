package model.utente;

import model.utente.giocatore.Giocatore;
import model.utente.giocatore.PosizioneEnum;
import model.valutazione.Valutazione;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGiocatore {

    private Giocatore giocatore;

    @BeforeEach
     void setUp() {

        // creo una data di nascita non fissa così che il test non fallisca in futuro
        LocalDate dataDiNascita = LocalDate.now().minusYears(25);

        giocatore = new Giocatore( "mj23", "pass", "Micheal", "Jordan", RuoloEnum.GIOCATORE,
                dataDiNascita, PosizioneEnum.GUARDIA, 198, 98, "fotoMJ" );

    }

    @Test
    void testmMediaVAlutazioniSenzaValutazioni() {

        int output = giocatore.mediaValutazioni();

        assertEquals(0, output);

    }

    @Test
    void testmMediaVAlutazioniConValutazioni() {

        Valutazione val1 = new Valutazione(3);
        giocatore.aggiungiValutazione(val1);
        Valutazione val2 = new Valutazione(4);
        giocatore.aggiungiValutazione(val2);

        int output = giocatore.mediaValutazioni();

        assertEquals(4, output);

    }

    @Test
    void testEta(){
        Integer output = giocatore.eta();
        assertEquals((Integer)25, output);
    }


}
