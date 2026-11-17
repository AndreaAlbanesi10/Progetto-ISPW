package model.campo;

public class Campo {

    private String nome;
    private String indirizzo;
    private String citta;
    private String descrizione;
    private String immagine;

    public Campo(String nome, String indirizzo, String citta, String descrizione, String immagine) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.descrizione = descrizione;
        this.immagine = immagine;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta () {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getDescrizione () {
        return descrizione;
    }

    public void getDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getImmagine () {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

}
