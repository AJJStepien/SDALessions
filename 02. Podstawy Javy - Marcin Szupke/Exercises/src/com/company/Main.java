package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int y = 6563401;

        String x = Integer.toString(y);
        System.out.println(x);
        int v = x.length()-1;
        System.out.print("Odwrotność: ");
        for(int l = 0; l < x.length(); l++){
            System.out.print(x.charAt(v));
            v--;
        }
        System.out.println();
        int u = 0;
        int t = 0;
        System.out.print("Odwrotność z użyciem while: ");
        while (y > 0){
            t = y % 10;
            System.out.print(t);
            y = y / 10;
            u++;
        }
        System.out.println();

        int[] table = {1,2,8,3,4,-1,-10,86,5};
        int result1 = 0;
        for(int l = 0; l < table.length; l++){
            result1 += table[l];
        }
        System.out.println("suma: " + result1);
        System.out.println("średnia: " + (double)result1/table.length);

        int val = 3;
        int result2 = 0;
        for(int l = 0; l < table.length; l++ ){
            if(table[l] == val){
                result2 = l;
            }
        }
        System.out.println("Indeks wartości " + val + " w tablicy wynosi: " + result2);
        System.out.println();
        int[] table2 = new int[table.length];
        int[] table3 = new int[table.length];
        for(int l = 0; l < table.length; l++){
            table2[l] = table[l];
        }
        System.out.println("table: " + Arrays.toString(table));
//        System.out.print("table: ");
//        for(int l = 0; l < table.length; l++) {
//            System.out.print(table[l] + " ");
//        }
        System.out.println();
        System.out.print("table2: " + Arrays.toString(table2));
//        System.out.print("table2: ");
//        for(int l = 0; l < table2.length; l++) {
//            System.out.print(table2[l] + " ");
//        }
        System.out.println();

        int max = 0;
        int min = 0;
        for(int l = 0; l < table.length; l++) {
            if(table[l] > max){
                max = table[l];
            }
            if(min > table[l]){
                min = table[l];
            }
        }
//        for (int r : table) {
//            if(table[r] > max) {
//                max = table[r];
//            }
//            if(min > table[r]) {
//                min = table[r];
//            }
//        }
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println();

        int liczba = 9;
        switch (liczba % 2) {
            case 0:
                System.out.println("Liczba " + liczba + " jest parzysta");
                break;
            case 1:
                System.out.println("Liczba " + liczba + " jest nieparzysta");
                break;
            default:
                System.out.println("Coś poszło nie tak");
        }

    }
}
