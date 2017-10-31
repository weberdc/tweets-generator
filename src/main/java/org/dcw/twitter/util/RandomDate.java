package org.dcw.twitter.util;

import java.time.LocalDate;
import java.util.Random;

/**
 * Random date generator from Stack Overflow post, which allows the date to be
 * constrained between upper and lower bounds.
 *
 * @author <a href="https://stackoverflow.com/users/396255/jens-hoffmann">Jens Hoffman</a>
 * @see <a href="https://stackoverflow.com/questions/3985392/generate-random-date-of-birth">java - Generate random date of birth - Stack Overflow</a>
 */
public class RandomDate {
    private final int minDay;
    private final int maxDay;
    private final Random random;

    public RandomDate(LocalDate minDate, LocalDate maxDate) {
        this.minDay = (int) minDate.toEpochDay();
        this.maxDay = (int) maxDate.toEpochDay();
        this.random = new Random();
    }

    public LocalDate nextDate() {
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    @Override
    public String toString() {
        return "RandomDate{" +
                "maxDate=" + LocalDate.ofEpochDay(maxDay) +
                ", minDate=" + LocalDate.ofEpochDay(minDay) +
                '}';
    }
}