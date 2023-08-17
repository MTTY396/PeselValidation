public class CheckDay {
    public static boolean checkDay(int monthNumber, int dayNumber){  //Sprawdza czy dzień się zgadza
        if ((monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12) && (dayNumber > 0 && dayNumber < 32)){
            return true;
        } else if ((monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11)  && (dayNumber > 0 && dayNumber < 31)){
            return true;
        } else if (monthNumber == 2 && dayNumber > 0 && dayNumber < 29) { //Jak sprawdzić rok przestępny
            return true;
        }
        else {
            return false;
        }
    }
}
