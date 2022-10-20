import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        System.out.println(d.getYear());
//         System.out.println(d.getDayOfWeek());

//        LocalTime t = LocalTime.now();
//        System.out.println(t);
//       System.out.println(t.getHour());
//        System.out.println(t.getNano());

//        LocalDateTime dt = LocalDateTime.now();
//        dt = LocalDateTime.of(2022, 11, 5, 12, 59);
//        System.out.println(dt);

//        LocalDate date = LocalDate.parse("2021-12-28");
//        System.out.println("Date: " + date);
//        System.out.println("Date + 10 days: " +
//                date.plusDays(10));

//        LocalDate date = LocalDate.parse("2021-12-28");
//        String dateInFullFormat = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
//                .withLocale(Locale.CHINA));
//        System.out.println(dateInFullFormat);

        LocalDate date = LocalDate.parse("2021-12-28");
        String dateFormatted = date.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        System.out.println(dateFormatted);
    }
}