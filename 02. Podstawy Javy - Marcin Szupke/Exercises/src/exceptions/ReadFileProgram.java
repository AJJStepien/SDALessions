package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileProgram {

    public static void main(String... args) {

        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("src/exceptions/Number.txt"));

            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line);
            }
            System.out.printf("Total = %d", total);
        }
        catch (FileNotFoundException e) {    // wyjątkow może byc wiele ale idziemy od najbardziej szczegolowego do najbardziej ogolnego
            System.out.println(e.getLocalizedMessage());
        }
        catch (IOException e) {    // wyjątkow może byc wiele ale idziemy od najbardziej szczegolowego do najbardziej ogolnego
            System.out.println(e.getLocalizedMessage());
        }
        catch (Exception e) {    // wyjątkow może byc wiele ale idziemy od najbardziej szczegolowego do najbardziej ogolnego
            System.out.println(e.getLocalizedMessage());
        }
        finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }



    }
}