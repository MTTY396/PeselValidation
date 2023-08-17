public class Month {
    int yearNumber;
    int month;
    public boolean checkMonth(int monthNumber) {  //Sprawdza czy miesiąc się zgadza
        if (monthNumber > 0 && monthNumber < 13){
            yearNumber += 1900;
            return true;
        }
        if (monthNumber > 20 && monthNumber < 33){
            month -= 20;
            yearNumber += 2000;
            return true;
        }
        if (monthNumber > 40 && monthNumber < 53){
            month -= 40;
            yearNumber += 2100;
            return true;
        }
        if (monthNumber > 60 && monthNumber < 73){
            month -= 60;
            yearNumber += 2200;
            return true;
        }
        if (monthNumber > 80 && monthNumber < 93){
            month -= 80;
            yearNumber += 1800;
            return true;
        }
        else {
            return false;
        }
    }
}
