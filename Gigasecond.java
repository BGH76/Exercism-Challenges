import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Gigasecond {

    private int yearGiven;
    private Month monthGiven;
    private int dayGiven;
    private int hourGiven;
    private int minuteGiven;
    private int secondGiven;

    public Gigasecond(LocalDate moment) {
        this.yearGiven = moment.getYear();
        this.monthGiven = moment.getMonth();
        this.dayGiven = moment.getDayOfMonth();

    }

    public Gigasecond(LocalDateTime moment) {
        this.yearGiven = moment.getYear();
        this.monthGiven = moment.getMonth();
        this.dayGiven = moment.getDayOfMonth();
        this.hourGiven = moment.getHour();
        this.minuteGiven = moment.getMinute();
        this.secondGiven = moment.getSecond();
    }

    public LocalDateTime getDateTime() {
        LocalDateTime mytime = LocalDateTime.of(yearGiven, monthGiven, dayGiven, hourGiven, minuteGiven, secondGiven);
        LocalDateTime convertedTime = mytime.plus(1000000000, ChronoUnit.SECONDS);
        return convertedTime;
    }
}
