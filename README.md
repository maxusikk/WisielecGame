# Gra w Wisielca

## Spis treści
1. [Opis projektu](#opis-projektu)
2. [Funkcjonalności](#funkcjonalności)
3. [Instrukcja obsługi](#instrukcja-obsługi)
    - [Wymagania](#wymagania)
    - [Instalacja](#instalacja)
    - [Uruchomienie](#uruchomienie)

## Opis projektu
Gra w Wisielca to klasyczna gra słowna, w której gracze próbują odgadnąć ukryte słowo, podając pojedyncze litery. Gracz ma ograniczoną liczbę prób, a każda błędna próba przybliża go do przegranej, reprezentowanej przez rysunek wisielca. Celem gry jest odgadnięcie słowa przed wyczerpaniem wszystkich prób.

## Funkcjonalności
- **Wczytywanie słów z pliku:** Gra losuje słowa do odgadnięcia z pliku tekstowego.
- **Interaktywne zgadywanie:** Gracz wprowadza litery, próbując odgadnąć ukryte słowo.
- **Rysowanie wisielca:** Gra rysuje wisielca w zależności od liczby pozostałych prób.
- **Sprawdzanie poprawności liter:** Gra sprawdza, czy wprowadzona litera jest poprawna (jedna litera, nie cyfra).
- **Wyświetlanie aktualnego stanu gry:** Aktualny stan zgadywanego słowa oraz liczba pozostałych prób są wyświetlane po każdej próbie.
- **Informacje końcowe:** Gra wyświetla komunikaty o wygranej lub przegranej oraz ujawnia ukryte słowo w przypadku przegranej.

## Instrukcja obsługi

### Wymagania
- Java Development Kit (JDK) w wersji 8 lub wyższej
- IDE obsługujące projekty Java, takie jak IntelliJ IDEA, Eclipse lub NetBeans
- Plik tekstowy `slowa.txt` zawierający słowa do zgadywania, umieszczony w odpowiednim katalogu

### Instalacja
1. **Pobierz i zainstaluj JDK:**
   - JDK można pobrać ze strony [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) lub [OpenJDK](https://openjdk.java.net/install/).
2. **Skonfiguruj IDE:**
   - Pobierz i zainstaluj wybrane IDE, jeśli jeszcze go nie masz.
   - Otwórz projekt w IDE.

### Uruchomienie
1. **Przygotuj plik `slowa.txt`:**
   - Utwórz plik `slowa.txt` zawierający listę słów do zgadywania, umieść go w katalogu `C:/Users/xdami/IdeaProjects/WisielecGame/` (lub odpowiednim katalogu w Twoim systemie).
   - Każde słowo powinno być w osobnej linii.

2. **Uruchom projekt:**
   - Otwórz plik `Main.java` w swoim IDE.
   - Uruchom plik `Main.java` jako aplikację Java.
   - Gra rozpocznie się automatycznie, a w terminalu pojawią się instrukcje do gry.

3. **Graj w grę:**
   - Wprowadzaj litery, aby zgadywać ukryte słowo.
   - Gra zakończy się, gdy odgadniesz całe słowo lub skończą Ci się próby.

4. **Przykładowy plik `slowa.txt`:**
komputer
programowanie
wisielec
java

Upewnij się, że plik jest poprawnie umieszczony i zawiera słowa w odpowiednim formacie.

To wszystko! Teraz możesz cieszyć się grą w Wisielca napisaną w Javie.
