package it.epicode.esercizi.esercizio2; // Package dell'esercizio 2

// CLASSE DIRIGENTE CON IL BONUS
public class Dirigente extends AbstractDipendente {
    private double bonus;

    // MI FACCIO UN COSTRUTTORE
    public Dirigente(String matricola, double stipendioBase, String dipartimento, double bonus) {
        super(matricola, stipendioBase, dipartimento); // CHIAMO IL COSTRUTTORE DELLA CLASSE PAD
        this.bonus = bonus;
    }

    // CALCOLO LO STIPENDIO DEL DIRIGENTE
    @Override
    public double calculateSalary() {
        return stipendioBase + bonus; // STIPENDIO CON AGGIUNTA DEL BONUS
    }
}