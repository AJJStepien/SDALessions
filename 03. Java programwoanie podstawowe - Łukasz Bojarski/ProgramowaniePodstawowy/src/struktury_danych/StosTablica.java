package struktury_danych;

public class StosTablica {
    private int tab[];
    private int top;

    public StosTablica(int size) {
        tab = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top<tab.length) {
            tab[++top] = value;
        }
        else {
            System.out.println("Stos jest pełen!");
            top = tab.length-1;
        }
    }

    public int pop() {
//        int value = tab[top];
//        top--;                        <<--- też będzie działać
//        return value;
        try {
            return tab[top--];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (top<-1) {
                System.out.println("Stos jest pusty!");
                return 0;
            }
            else if (top > tab.length-1){
                System.out.println("Stos jest pełen! Powrót na górę stosu");
                top = tab.length - 1;
                return tab[top--];
            }
        }
        return tab[top--];
    }

    public boolean isEmpty() {
//        if (top == -1) {
//            return true;
//        } else {
//            return false;
//        }
        return top == -1;
    }
    public boolean isFull() {
//        inaczej:
//        if( top == tab.length - 1){
//            return true;
//        }else{
//            return false;
//        }
        return top == tab.length - 1;
    }

    public int peek() {
//        if (top > tab.length) {
//            return tab[tab.length-1];
//        }
//        else {
//            return tab[top];
//        }
        try{
            return tab[top];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Jesteś poza stosem! Powrót na górę stosu.");
            top = tab.length - 1;
            return  tab[top];
        }
    }
}
