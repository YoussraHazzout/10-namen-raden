import java.util.Arrays;
import java.util.Scanner;

public class NamenRaden {
    public static void main(String[] args) {

        // Welkom Bericht
        System.out.println("-------------------------------------------------------");
        System.out.println("Welkom bij het spel: Raad de naam!");
        System.out.println("-------------------------------------------------------");
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Boolean speel = true;

        // Spel en namen
        do {
            System.out.println("Voer een van de namen de leerlingen van ITMG JAVA: ");
            System.out.println(" Let op: de namen zijn hoofdletter gevoelig!");

            String[] naam = new String[]{"William", "Bas", "Petra", "Corinne", "Ahmet", "Youssra", "Jeffery", "André", "Henk", "Jade"};
            String guess = s.nextLine();

            // Goed Geraden!
            if (guess.equals(naam[0]) || guess.equals(naam[1]) || guess.equals(naam[2]) || guess.equals(naam[3]) || guess.equals(naam[4]) || guess.equals(naam[5]) || guess.equals(naam[6]) || guess.equals(naam[7]) || guess.equals(naam[8]) || guess.equals(naam[9])) {
                System.out.println("Goed geraden, je hebt het spel gewonnen! :) ");
            }

            // Oops, fout geraden!
            else if (guess != naam[0] || guess != naam[1] || guess != naam[2] || guess != naam[3] || guess != naam[4] || guess != naam[5] || guess != naam[6] || guess != naam[7] || guess != naam[8] || guess != naam[9]) {
                System.out.println("Je hebt verkeerd geraden, probeer het nogmaals. :( ");
                speel = true;
            }


            // nog een keer?;
            System.out.println("Wil je nogmaals spelen? Ja of Nee?");
            String nogeenkeer = s.nextLine();
            if (nogeenkeer.equalsIgnoreCase("Ja")) {
                speel = true;

                // Spel Stoppen
            }
            if (nogeenkeer.equalsIgnoreCase("Nee")) {
                speel = false;
                System.out.println("Bedankt voor het spelen, tot de volgende keer! :)");
                break;
            }
        } while (speel = true);
    }
}





