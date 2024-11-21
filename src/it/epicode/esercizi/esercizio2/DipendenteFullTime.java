package it.epicode.esercizi.esercizio2;

// CLASSE DIPENDENTE FULLTIME
public class DipendenteFullTime extends AbstractDipendente {

    // MI FACCIO UN COSTRUTTORE
    public DipendenteFullTime(String matricola, double stipendioBase, String dipartimento) {
        super(matricola, stipendioBase, dipartimento); // CHIAMO IL COSTRUTTORE DELLA CLASSE PAD
    }

    // OVERRIDE PER CALCOLARE LO STIPENDIO BASE
    @Override
    public double calculateSalary() {
        return stipendioBase;
    }
}