import java.text.ParseException;
import java.util.Scanner;

public class Pesel {

    public static boolean validation() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String numberPesel = scanner.nextLine();
//        ControlNumber controlNumber = new ControlNumber();

        int yearNumber = Integer.parseInt(numberPesel.substring(0, 2));
        int monthNum = Integer.parseInt(numberPesel.substring(2, 4));
        int dayNumber = Integer.parseInt(numberPesel.substring(4, 6));

        int sexNumber = Integer.parseInt(numberPesel.substring(9, 10));
        int control = Integer.parseInt(numberPesel.substring(10, 11));
//        Day day = new Day();
        Month month = new Month();

        if (numberPesel.length() == 11 && ControlNumber.checkControlNumber(numberPesel) == control && month.checkMonth(monthNum) && CheckDay.checkDay(monthNum + month.month, dayNumber)){
            int validMonth = monthNum + month.month;
            int validYear = month.yearNumber + yearNumber;
            String date = dayNumber + "." + validMonth + "." + validYear;
//            System.out.println(date);

            System.out.println("Urodziłeś się: " + dayNumber + "." + validMonth + "." + validYear);
            System.out.println(Day.getWhichDay(dayNumber) + WhichMonth.whichMonth(monthNum));
            System.out.println(DayOfWeek.dayOfWeek(date));
            System.out.println("Płeć: " + Sex.checkSex(sexNumber));
            System.out.println("Numer kontrolny: " + control);
            return true;
        } else {
            return false;
        }
    }

}
