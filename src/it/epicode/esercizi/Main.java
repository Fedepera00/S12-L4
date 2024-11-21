package it.epicode.esercizi;

import it.epicode.esercizi.esercizio2.*; // IMPORT DIP AVANZATI
import it.epicode.esercizi.esercizio3.*; // IMPORT VOLONTARI

import java.util.ArrayList; // FRAMEWORK PER CREARE LISTE DINAMICHE
import java.util.List;
import java.util.Scanner;

// START
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<AbstractDipendente> dipendentiAvanzati = new ArrayList<>();
        List<ICheckable> checkables = new ArrayList<>();
        boolean exit = false;

        // MENU APPLICAZIONE UTILIZZANDO IL CICLO WHILE
        while (!exit) { // COSI CONTINUA FNO A QUANDO NON DECIDIAMO DI USCIRE

            System.out.println("\nMenu:");
            System.out.println("1. Creare dipendenti");
            System.out.println("2. Visualizzare i tuoi dipendenti ");
            System.out.println("3. Calcola lo stipendio totale dei dipendenti");
            System.out.println("4. Aggiungere un volontario");
            System.out.println("5. Esegui check-in per tutti");
            System.out.println("6. Esci dal programma");
            System.out.print("Scegli una delle opzioni proposte: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            // SWITCHO OPZIONI MENU
            switch (scelta) {
                case 1:
                    // CREARE DIPENDENTI
                    dipendentiAvanzati.add(new DipendenteFullTime("74", 1600, " ADDETTO ALLA PRODUZIONE"));
                    dipendentiAvanzati.add(new DipendentePartTime("50", 1200, "ADDETTO ALLE VENDITE", 60));
                    dipendentiAvanzati.add(new Dirigente("5", 5000, " SEGRETERIA AMMINISTRAZIONE", 2000));
                    checkables.addAll(dipendentiAvanzati);
                    System.out.println("Dipendenti avanzati creati.");
                    break;

                case 2:
                    // VIEW LISTA DIENDENTI
                    if (dipendentiAvanzati.isEmpty()) {
                        System.out.println("Nessun dipendente avanzato creato.");
                    } else {
                        System.out.println("Dipendenti avanzati:");
                        for (AbstractDipendente dipendente : dipendentiAvanzati) {
                            System.out.println(dipendente);
                        }
                    }
                    break;

                case 3:
                    // CALCOLO STIPENDIO TOTALE TRA TUTTI I MIEI DIPENDENTI
                    double stipendioTotale = 0;
                    for (AbstractDipendente dipendente : dipendentiAvanzati) {
                        stipendioTotale += dipendente.calculateSalary();
                    }
                    System.out.println("Stipendio totale: " + stipendioTotale);
                    break;

                case 4:
                    // AGGIUNGIAMO UN VOLONTARIO
                    System.out.print("Inserisci il nome del volontario: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci l'età del volontario: ");
                    int eta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Inserisci il CV del volontario: ");
                    String cv = scanner.nextLine();
                    Volontario volontario = new Volontario(nome, eta, cv);
                    checkables.add(volontario);
                    System.out.println("Volontario aggiunto con successo.");
                    break;

                case 5:
                    // ESEGUIRE TUTTI I CHECK-IN DELLA DITTA
                    if (checkables.isEmpty()) {
                        System.out.println("Nessun elemento disponibile per il check-in.");
                    } else {
                        System.out.println("Esecuzione del check-in:");
                        for (ICheckable checkable : checkables) {
                            checkable.checkIn();
                        }
                    }
                    break;

                case 6:
                    // CHIUSURA SOFTWARE PROGRAMAM D'USCITA DITTA
                    exit = true;
                    System.out.println("Programma terminato e chiuso.");
                    break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        }

        scanner.close();
    }
}