package it.epicode.esercizi.esercizio2;

import it.epicode.esercizi.esercizio3.ICheckable; // INTERFACCIA

// CLASSE ASTRATTA CHE RAPPRESENTA UN DIPENDENTE AVANZATO
public abstract class AbstractDipendente implements ICheckable {
    protected String matricola;
    protected double stipendioBase;
    protected String dipartimento;

    // COSTRUTTORE DELLA CLASSE ASTRATTA PER INIZIALIZZARE I CAMPI
    public AbstractDipendente(String matricola, double stipendioBase, String dipartimento) {
        this.matricola = matricola;
        this.stipendioBase = stipendioBase;
        this.dipartimento = dipartimento;
    }

    // METODO ASTRATTO PER LE SOTTOCLASSI
    public abstract double calculateSalary();

    // QUI USO METODO GETTER PER OTTENERE LA MATRICOLA
    public String getMatricola() {
        return matricola;
    }

    // QUI USO METODO GETTER PER OTTENERE IL DIPARTIMENTO
    public String getDipartimento() {
        return dipartimento;
    }

    // OVERRIDE PER INDICARE CHE IL DIPENDENTE HA FATTO IL CHECK-IN
    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola " + matricola + " ha iniziato il turno.");
    }

    // toString PER RAPPRESENTARE I DETTAGLI DEL DIPENDENTE COME STRINGA
    @Override
    public String toString() {
        return "Dipendente{matricola='" + matricola + "', dipartimento='" + dipartimento + "'}";
    }
}