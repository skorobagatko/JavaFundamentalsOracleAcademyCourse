package lecture7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        FormatStyle style = FormatStyle.SHORT;
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(style);
        String formattedDateTime = ldt.format(formatter);
        System.out.println(formattedDateTime);

        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(ldt);

        formatter = DateTimeFormatter.ofPattern("yyyy/MMMM/dd H:mm a", Locale.CHINA);
        String dateTimePattern = ldt.format(formatter);
        System.out.println(dateTimePattern);

        System.out.println(LocalDateTime.parse(dateTimePattern, formatter));
    }
}
