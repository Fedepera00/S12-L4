package it.epicode.esercizi.esercizio2;

// CLASSE DIPENDENTE PART-TIME
public class DipendentePartTime extends AbstractDipendente {
    private int oreLavorate; // ORE LAVORATE DL DIPENDENTE

    // MI FACCIO IL COSTRUTTORE
    public DipendentePartTime(String matricola, double stipendioBase, String dipartimento, int oreLavorate) {
        super(matricola, stipendioBase, dipartimento); // CHIAMO IL COSTRUTTORE DELLA CLASSE PAD
        this.oreLavorate = oreLavorate;
    }

    // CALCOLO LO STIPENDIO DEL DIPENDENTE
    @Override
    public double calculateSalary() {
        return stipendioBase * oreLavorate / 160; // IL CALCOLO LO FACCIO IN PROPORZIONE ALLE ORE CHE LAVORA
    }
}