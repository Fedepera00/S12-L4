package it.epicode.esercizi.esercizio1;

// DIPENDENTE NORMALE
public class DipendenteSemplice {
    private String matricola;
    private double stipendio;
    private String dipartimento;

    // MI CREO IL COSTRUTTORE
    public DipendenteSemplice(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // OTTENGO LA MATRICOLA DEL DIPENDENTE
    public String getMatricola() {
        return matricola;
    }

    // OTTENERE LO STIPENDIO DEL DIPENDENTE
    public double getStipendio() {
        return stipendio;
    }

    // OTTENGO IL DIPARTIMENTO DEL DIPENDENTE
    public String getDipartimento() {
        return dipartimento;
    }

    // AGGIORNO IL DIPARTIMENTO DEL DIP
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }
}