import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Podaj numer PESEL");

        if (Pesel.validation()){
            System.out.println("Poprawny numer Pesel");
        }
        else {
            System.out.println("Niepoprawny numer Pesel");
        }
    }
}