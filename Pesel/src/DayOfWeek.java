import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {
    public static String dayOfWeek(String inputDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = dateFormat.parse(inputDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            String dayOfWeekText;

            switch (dayOfWeek) {
                case Calendar.MONDAY:
                    dayOfWeekText = "poniedziałek";
                    break;
                case Calendar.TUESDAY:
                    dayOfWeekText = "wtorek";
                    break;
                case Calendar.WEDNESDAY:
                    dayOfWeekText = "środa";
                    break;
                case Calendar.THURSDAY:
                    dayOfWeekText = "czwartek";
                    break;
                case Calendar.FRIDAY:
                    dayOfWeekText = "piątek";
                    break;
                case Calendar.SATURDAY:
                    dayOfWeekText = "sobota";
                    break;
                case Calendar.SUNDAY:
                    dayOfWeekText = "niedziela";
                    break;
                default:
                    dayOfWeekText = "Nieprawidłowy dzień tygodnia";
                    break;
            }
            return dayOfWeekText;
        } catch (ParseException e) {
            System.out.println("Nieprawidłowy format daty.");
        }
        return inputDate;
    }
}