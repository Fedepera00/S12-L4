package it.epicode.esercizi.esercizio3;

import it.epicode.esercizi.esercizio2.AbstractDipendente; // IMPORT CLASSE ABSTRACT DIPENDENT

// CLASSE DIP AVANZATO
public class DipendenteAvanzato extends AbstractDipendente implements ICheckable {

    // MI FACCIO UN COSTRUTTORE
    public DipendenteAvanzato(String matricola, double stipendioBase, String dipartimento) {
        super(matricola, stipendioBase, dipartimento); // CHIAMO IL COSTRUTTORE DELLA CLASSE PAD
    }

    // OVERRIDE PER CALCOLARE LO STIP DEL DIPENDENTE
    @Override
    public double calculateSalary() {
        return stipendioBase;
    }

    // CHECK-IN DIPENDENTE
    @Override
    public void checkIn() {
        System.out.println("Dipendente avanzato con matricola " + getMatricola() + " ha iniziato il turno."); // Messaggio
    }
}