package animals;

public class ZbytDuzeZmeczenieException extends Exception {
    public static void zmeczenie() throws ZbytDuzeZmeczenieException {
        if (true) {
            throw new ZbytDuzeZmeczenieException();
        }
        else {
            //nic nie rób
        }
    }
}
