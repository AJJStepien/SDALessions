package programowanie;

import algorytmy.OdwroconaNotackaPolska;
import struktury_danych.StosTablica;
import struktury_danych.Tablice;
import struktury_danych.kolejka_dwukierunkowa_lista.KDwukierunkowaLista;
import struktury_danych.kolejka_lista.KolejkaLista;
import struktury_danych.stos_lista.StosLista;

import java.util.Scanner;

public class Main {

    public static void tablice() {
        int[] table = {2, 5, 6, 1, 6, 3, 7, 8, 9, 4, 2, -1, 0, 10, 11, 9, -1, 8, 123, 2, 65, 93, 2, 3};
        int x = 7;
        Tablice tablica = new Tablice();
        tablica.wypiszOdKoncaNaPaorzystychIndeksach(table);
        System.out.println();

        System.out.println("Suma tablicy: " + tablica.sumujTablice(table));
        System.out.println("Suma " + x + " Elementów: " + tablica.sumujXElementow(table, x));
        System.out.println("Suma podzielnych przez trzy: " + tablica.sumaLiczbPodzielnychPrzezTrzy(table));
        System.out.println("Suma 5 pierwszych podzielona przez ostatnią: " + tablica.sumaPieciuPierwszychPodzielonychPrzezOstatnia(table));

    }

    public static void stosTablica() {
//       Tutaj się uczyłem:
//        int x = 5;
//        int y = 6;
//        StosTablica stosTablica = new StosTablica(10);
//        stosTablica.push(x);
//        stosTablica.push(y);
//        System.out.println("Czy stos jest pusty?: " + stosTablica.isEmpty());
//        System.out.println("Liczba na górze stosu: " + stosTablica.peek());
//        System.out.println("Liczba na górze stosu po popie: " + stosTablica.pop());
//        System.out.println("Wyciągamy liczbę ze stosu a jest nią: " + stosTablica.pop());
//        System.out.println("Czy teraz stos jest pusty?: " + stosTablica.isEmpty());
//        System.out.println("Teraz wyjdziemy poza stos i złapiemy wyjątek: " + stosTablica.pop());

        StosTablica stosTablica = new StosTablica(10);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWybierz: 1-push  2-pop  3-peek  4-isEmpty  5-isFull  0-wyjście");
            System.out.print("Wybieram opcję: ");
            int instruction = scanner.nextInt();
            switch (instruction) {
                case 0:
                    return;
                case 1:
                    System.out.print("Podaj liczbę: ");
                    int l = scanner.nextInt();
                    try {
                        stosTablica.push(l);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Stos jest pełny!");
                    }
                    break;
                case 2:
                    System.out.println("Pop: " + stosTablica.pop());
                    break;
                case 3:
                    System.out.println("Peek: " + stosTablica.peek());
                    break;
                case 4:
                    System.out.println("Czy jest pusty?: " + stosTablica.isEmpty());
                    break;
                case 5:
                    System.out.println("Czy jest pełny?: " + stosTablica.isFull());
                    break;
                default:
                    System.out.println("Nieprawidłowa instrukcja");
            }

        }

    }

    public static void stosLista() {
        StosLista sl = new StosLista();
        System.out.println("1-push| 2-pop| 3-peek| 4-print| 5-isEmpty| 0-wyjście|");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int instrukcja = scanner.nextInt();
            switch (instrukcja) {
                case 1:
                    System.out.print("Podaj liczbę: ");
                    int x = scanner.nextInt();
                    sl.push(x);
                    break;
                case 2:
                    System.out.println(sl.pop());
                    break;
                case 3:
                    System.out.println(sl.peek());
                    break;
                case 4:
                    sl.print();
                    break;
                case 5:
                    sl.isEmpty();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("coś poszło nie tak");
            }
        }


//        sl.push(100);
//        sl.push(500);
//        sl.push(4);
//        sl.print();
//        System.out.println(sl.pop());
//        System.out.println(sl.peek());
//        System.out.println(sl.pop());
    }

    public static void kolejkaLista() {
        KolejkaLista kl = new KolejkaLista();
        System.out.println("1-add| 2-poll| 3-peek| 4-print| 5-isEmpty| 0-wyjście|");
        Scanner scanner = new Scanner(System.in);
        int instrukcja = scanner.nextInt();
        while (true) {
            switch (instrukcja) {
                case 1:
                    System.out.print("Podaj liczbę: ");
                    int x = scanner.nextInt();
                    kl.add(x);
                    break;
                case 2:
                    kl.poll();
                    break;
                case 3:
                    kl.peek();
                    break;
                case 4:
                    kl.print();
                    break;
                case 5:
                    kl.isEmpty();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("coś poszło nie tak");
            }
        }
//        kl.add(100);
//        kl.add(400);
//        kl.add(5);
//        kl.peek();
//        kl.print();
//        System.out.println(kl.poll());
//        System.out.println(kl.peek());
//        System.out.println(kl.poll());
    }

    public static void dwukierunkowaLista() {
        KDwukierunkowaLista kd = new KDwukierunkowaLista();
        System.out.print("1-addFirst  | 2-addLast     | \n" +
                "3-pollFirst | 4-pollLast    | \n" +
                "5-peekFirst | 6-peekLast    | \n" +
                "7-print     | 8-printReverse| \n" +
                "9-isEmpty   | 0-wyjście     |");
        Scanner scanner = new Scanner(System.in);
        int instrukcja = scanner.nextInt();
        while (true) {
            switch (instrukcja) {
                case 1:
                    System.out.print("Podaj liczbę: ");
                    int x = scanner.nextInt();
                    kd.addFirst(x);
                    break;
                case 2:
                    System.out.print("Podaj liczbę: ");
                    int y = scanner.nextInt();
                    kd.addLast(y);
                    break;
                case 3:
                    System.out.println(kd.pollFirst());
                    break;
                case 4:
                    System.out.println(kd.pollLast());
                    break;
                case 5:
                    System.out.println(kd.peekFirst());
                    break;
                case 6:
                    System.out.println(kd.peekLast());
                    break;
                case 7:
                    kd.print();
                    break;
                case 8:
                    kd.printReverse();
                    break;
                case 9:
                    System.out.println(kd.isEmpty());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("coś poszło nie tak");
            }
        }
//        System.out.println(kd.isEmpty());
//        kd.addFirst(10);
//        kd.addLast(15);
//        kd.addFirst(23);
//        kd.addLast(22);
//        kd.addFirst(18);
//        kd.addLast(6);
//        System.out.println(kd.isEmpty());
//        kd.pollFirst();
//        kd.pollLast();
//        System.out.println(kd.isEmpty());
//        kd.addFirst(5);
//        kd.addLast(3);
//        kd.print();
//        kd.printReverse();
//        System.out.println(kd.pollFirst());
//        System.out.println(kd.peekFirst());
//        System.out.println(kd.pollLast());
//        System.out.println(kd.peekLast());

    }
    public static void odwroconaNotacjaPolska(){
        Scanner scanner = new Scanner(System.in);
        OdwroconaNotackaPolska onp = new OdwroconaNotackaPolska();
        System.out.print("Wpisz działanie: ");
        String operation = scanner.nextLine();
        System.out.println();
        System.out.println(onp.przeksztalcNaONP(operation));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-tablice               | 2-stosTablica     | \n" +
                "3-stosLista             | 4-kolejkaLista               | \n" +
                "5-Lista dwukierunkowa   | 6-odwroconaNotacjaPolska     |" +
                "0-wyjście               | ");
        int instrukcja = scanner.nextInt();
        switch (instrukcja) {
            case 1:
                System.out.println("Tablice:\n");
                tablice();
                break;
            case 2:
                System.out.println("StosTablica:\n");
                stosTablica();
                break;
            case 3:
                System.out.println("StosLista:\n");
                stosLista();
                break;
            case 4:
                System.out.println("KolejkaLista:\n");
                kolejkaLista();
                break;
            case 5:
                System.out.println("Lista dwukierunkowa:\n");
                dwukierunkowaLista();
                break;
            case 6:
                System.out.println("Odwrócona Notacja Polska:\n");
                odwroconaNotacjaPolska();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("coś poszło nie tak");
        }
    }
}

