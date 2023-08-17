public class Sex {

    public static String checkSex( int sexNumber) {  //Sprawdza płeć
        String sex;
        if (sexNumber % 2 != 0) {
            sex = "mężczyzna";
        } else {
            sex = "kobieta";
        }
        return sex;
    }
}
