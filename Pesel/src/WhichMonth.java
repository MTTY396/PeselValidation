public class WhichMonth {
    public static String whichMonth(int monthNum){  //Sprawdza który miesiąc
        if (monthNum > 20 && monthNum < 33){
            monthNum -= 20;
        }
        if (monthNum > 40 && monthNum < 53){
            monthNum -= 40;
        }
        if (monthNum > 60 && monthNum < 73){
            monthNum -= 60;
        }
        if (monthNum > 80 && monthNum < 93){
            monthNum -= 80;
        }
        String month = null;
        switch (monthNum) {
            case 1 -> {
                month = "Stycznia";
                return month;
            }
            case 2 -> {
                month = "Lutego";
                return month;
            }
            case 3 -> {
                month = "Marca";
                return month;
            }
            case 4 -> {
                month = "Kwietnia";
                return month;
            }
            case 5 -> {
                month = "Maja";
                return month;
            }
            case 6 -> {
                month = "Czerwca";
                return month;
            }
            case 7 -> {
                month = "Lipca";
                return month;
            }
            case 8 -> {
                month = "Sierpnia";
                return month;
            }
            case 9 -> {
                month = "Września";
                return month;
            }
            case 10 -> {
                month = "Października";
                return month;
            }
            case 11 -> {
                month = "Listopada";
                return month;
            }
            case 12 -> {
                month = "Grudnia";
                return month;
            }
            //default -> System.out.println("Niepoprawny numer Pesek");
        }
        return month;
    }
}
