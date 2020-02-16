package algorytmy;

public class Sortowanie {

    public static void main(String[] args) {
        int[] tab = {1, 2, 7, 4, 2, 1, 6, 7, 101, 22, 18};
        Sortowanie sort = new Sortowanie();
        int k = 102;
        System.out.println(sort.countingSort(tab, k));
    }

    public void selectSort(int[] tab) {

    }

    public int[] bubbleSort(int[] tab) {
        int swap = 0;
        boolean flag = false;
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] > tab[i + 1]) {
                    swap = tab[i];
                    tab[i + 1] = tab[i];
                    tab[i] = swap;
                }
            }
        }
        return tab;
    }

    public int[] countingSort(int[] array, int k) {
        int[] count = new int[k];
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++; //count[array[i]] = count[array[i]] + 1;
        }
        for (int i = 1; i < k; i++) {
            count[i] += count[i - 1];
        }
        for (int i = array.length; i >= 0; i--) {
            output[count[array[i]]] = array[i];
            count[array[i]] = count[array[i - 1]];
        }
        return output;
    }

    public int[] insertSort(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            for (int j = i; j >= 1 && tab[j - 1] > tab[1]; j--) {
                //tutaj ma być metoda swap zamieniająca indeksy i oraz j;
            }
        }
        return tab;
    }

    public int[] quickSort(int[] tab) {


        return tab;
    }
}
