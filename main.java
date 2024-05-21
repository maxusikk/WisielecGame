import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {

        File slownik = new File("C:/Users/xdami/IdeaProjects/WisielecGame/slowa.txt");

        Scanner textScanner = new Scanner(slownik);
        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        while (textScanner.hasNextLine()) {
            words.add(textScanner.nextLine());
        }

        String hiddenText = words.get((int) (Math.random() * words.size()));
        char[] textArray = hiddenText.toCharArray();

        char[] mojaOdpowiedz = new char[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            mojaOdpowiedz[i] = '?';
        }

        boolean koniec = false;
        int zycia = 6;
        while (!koniec && zycia > 0) {
            System.out.println("******************************");

            String litera = input.next();
            // sprawdzenie prawidlowosci danych
            while (litera.length() != 1 || Character.isDigit(litera.charAt(0))) {
                System.out.println("Niepoprawna wartosc - Sprobuj ponownie");
                litera = input.next();
            }

            boolean found = false;
            for (int i = 0; i < textArray.length; i++) {
                if (litera.charAt(0) == textArray[i]) {
                    mojaOdpowiedz[i] = textArray[i];
                    found = true;
                }
            }

            if (!found) {
                zycia--;
                System.out.println("Nie znaleziono litery w tekście.");
            }

            // Wyświetlanie aktualnego stanu zgadywanego słowa
            for (char c : mojaOdpowiedz) {
                System.out.print(c + " ");
            }
            System.out.println("\nLives left: " + zycia);
            drawHangman(zycia);

            // Sprawdzenie czy wszystkie litery zostały zgadnięte
            koniec = true;
            for (char c : mojaOdpowiedz) {
                if (c == '?') {
                    koniec = false;
                    break;
                }
            }

            if (koniec) {
                System.out.println("Gratulacje! Zgadłeś słowo: " + hiddenText);
            } else if (zycia <= 0) {
                System.out.println("Przegrales! Sprobuj jeszcze raz! Słowo to: " + hiddenText);
            }
        }

        textScanner.close();
        input.close();
    }

    public static void drawHangman(int lives) {
        switch (lives) {
            case 6:
                System.out.println("|----------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 5:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 2:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 1:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|   /");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            default:
                System.out.println("|----------");
                System.out.println("|    O");
                System.out.println("|   -|-");
                System.out.println("|   / \\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
        }
    }
}
