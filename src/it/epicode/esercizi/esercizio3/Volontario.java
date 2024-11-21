package it.epicode.esercizi.esercizio3;

// CLASSE DEL VOLONTARIO
public class Volontario implements ICheckable {
    private String nome;
    private int eta;
    private String cv;

    // MI FACCIO UN ALTRO COSTRUTTORE
    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    // OVERRIDE CHECK-IN VOLONTARIO
    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha iniziato il servizio.");
    }
}