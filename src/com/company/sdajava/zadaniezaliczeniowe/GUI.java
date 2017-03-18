package com.company.sdajava.zadaniezaliczeniowe;

/**
 * Created by RENT on 2017-03-18.
 */
public class GUI {
    public static void showMenu() {

        //Ekran powitalny i menu główne

        System.out.println("Witamy w programie wspomagającym organizację w Twojej firmie \n" +

                "1. Wyświetl listę wszystkich pracowników \n" +
                "2. Dodaj nowego pracownika \n" +
                "3. Eksporuj listę pracowników do pliku \n" +
                "4. Edycja danych pracownika \n" +
                "5. Dodatkowe funkcje \n" +
                "6. Dodatkowe funkcje dla plików tekstowych \n" +
                "7. Informacja o programie \n" +
                "8. Wyjście z programu"
        );

    }

    //Podmenu dla punktu nr 5 menu głównego

    public static void showAdditionalMenu() {

        System.out.println("Lista dodatkowych funkcjonalności \n" +

                "1. Obliczanie liczby pracowników z pensją nie mniejszą niż podana przez użytkownika \n" +
                "2. Obliczanie średniej płacy w wybranym dziale firmy \n" +
                "3. Wyświetlanie największej pensji wśród kobiet i męzczyzn \n" +
                "4. Wyświetlanie informacji o poszczególnych działach firmy \n" +
                "5. Wyświetlanie stosunku średniej płacy kobiet do średniej płacy mężczyzn \n" +
                "6. Zwiększanie pensji wszystkim pracownikom o 10% \n" +  //oraz dodatkowo za specjalne cechy?
                "7. Zwiększanie wszystkich pensji o kwotę podaną przez pracownika \n" + //plus wyświetlania sumy podwyżek i stosunku podwyżek kobiet do męzczyzn
                "8. Sortowanie pracowników (w pliku) według nazwiska \n" +
                "9. Sortowanie pracowników (w pliku) według wysokości pensji \n" +
                "10. Powrót do menu głównego"

        );
    }

    //Podmentu dla punktu nr 6 menu głównego. Wybranie tej funkcji ma powodować eksport danych do pliku tekstowego

    public static void showAdditionalTextMenu() {

        System.out.println("Dodatkowe funkcje dla plików tekstowych \n" +

                "1. Wyświetlenie danych o osobie z najdłuższym nazwiskiem \n" +
                "2. Obliczenie średniego wieku osób posiadających dzieci \n" +
                "3. Zakodowanie nazwisk osób, których zarobek jest niższy od średniego zarobku wszystkich pracowników \n" +
                "4. Uworzenie pliku pracownicy.html \n" +
                "5. Powrót do menu głównego"
        );
    }

    //punkt 7

    public static String informacjeOProgramie = "Program powstaje na zlecenie L.Ogana. \n" +
            "Informacje na temat projektu znajdują się na stronie: \n" +
            "https://github.com/SdaJavaTorun/ZADANIA/blob/master/ProgramowanieObiektowe.txt";
}
