import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Persona[] persona = new Persona[10];
        Scanner myObj = new Scanner(System.in);
        int userInput;
        int count = 0;

        while (true){
            System.out.println("Ciao! Cosa vuoi fare? ");
            System.out.println("1. Crea Studente\n2. Esci");
            userInput = myObj.nextInt();
            switch (userInput){
                case 1:
                    if (count < persona.length){
                        System.out.print("Inserisci nome: ");
                        String nome = myObj.next();
                        System.out.print("Inserisci cognome: ");
                        String cognome = myObj.next();
                        System.out.print("Inserisci eta: ");
                        int eta = myObj.nextInt();
                        System.out.print("Inserisci il corso: ");
                        String corso = myObj.next();
                        System.out.print("Inserisci anno di corso: ");
                        int anno = myObj.nextInt();
                        persona[count] = new Persona.Studenti(nome, cognome, eta, corso, anno);
                        System.out.println("Studente creato: "
                                + persona[count].getNome() + " "
                                + persona[count].getCognome() + ", Età: "
                                + persona[count].getAge() + ", Corso: "
                                + ((Persona.Studenti) persona[count]).getCorso() + ", Anno corso: "
                                + ((Persona.Studenti) persona[count]).getAnno());
                        count++;
                    } else {
                        System.out.println("Non c'è spazio per altri studenti.");
                    }
                    break;
                case 2:
                    System.out.println("Arrividerci!");
                    myObj.close();
                    return;

                default:
                    System.out.print("Opzione non valida. Riprova. ");
                    break;
            }
        }
    }
}