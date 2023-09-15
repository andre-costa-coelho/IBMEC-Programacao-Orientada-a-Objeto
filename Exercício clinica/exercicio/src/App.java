import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
         LocalDate data = LocalDate.of(2000, 1, 1);
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

         System.out.println(data.format(formato));
    }
}
