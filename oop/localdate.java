import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localdate {
    public void main(String[]args){
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalTime now=LocalTime.now();
        System.out.println(now);
        LocalDateTime tommorrow=LocalDateTime.now();
        System.out.println(tommorrow);
        Instant tody=Instant.now();
        System.out.println(tody);
    }

}
