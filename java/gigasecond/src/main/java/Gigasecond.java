import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime current;
    public Gigasecond(LocalDate moment) {
        this.current = moment.atTime(0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.current = moment;
    }

    public LocalDateTime getDateTime() {
        return this.current.plusSeconds(1000000000);
    }
}
