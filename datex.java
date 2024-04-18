import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datex {
    public static void main(String[] args) {
        // Date Time API
        // sql, (util) ✅

        LocalTime lt = LocalTime.now();
        // System.out.println(lt);
        
        LocalDate ld = LocalDate.now();
        // System.out.println(ld.getDayOfMonth());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println(ldt.plusDays(20));

        System.out.println(ldt.plusHours(20));

       System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a")));


       LocalDate ld1 = LocalDate.of(2024, 1, 1);
       System.out.println(ld1.minusDays(40));
    }
}
