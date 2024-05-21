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

        char[] myAnswers = new char[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            myAnswers[i] = '?';
        }

        boolean finished = false;
        int lives = 6;

        while (!finished && lives > 0) {
            System.out.println("******************************");

            String letter = input.next();
            // sprawdzenie prawidlowosci danych
            while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
                System.out.println("Niepoprawna wartosc - Sprobuj ponownie");
                letter = input.next();
            }

            boolean found = false;
            for (int i = 0; i < textArray.length; i++) {
                if (letter.charAt(0) == textArray[i]) {
                    myAnswers[i] = textArray[i];
                    found = true;
                }
            }

            if (!found) {
                lives--;
                System.out.println("Nie znaleziono litery w tekście.");
            }

            // Wyświetlanie aktualnego stanu zgadywanego słowa
            for (char c : myAnswers) {
                System.out.print(c + " ");
            }
            System.out.println("\nLives left: " + lives);
            drawHangman(lives);

            // Sprawdzenie czy wszystkie litery zostały zgadnięte
            finished = true;
            for (char c : myAnswers) {
                if (c == '?') {
                    finished = false;
                    break;
                }
            }

            if (finished) {
                System.out.println("Gratulacje! Zgadłeś słowo: " + hiddenText);
            } else if (lives <= 0) {
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
