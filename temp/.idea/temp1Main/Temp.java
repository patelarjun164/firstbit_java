import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;


public class Temp {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        // System.out.println("Hello world");
        // LocalDate startDate = LocalDate.now();
        // LocalDate endDate = LocalDate.of(2025, 3, 3);
        // long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);   // Current date
        // LocalTime time = LocalTime.now();   // Current time
        // // LocalDateTime dateTime = LocalDateTime.now(); // Current date and time

        // System.out.println("Current Date: " + startDate);
        // System.out.println("End Date: " + endDate);
        // System.out.println("Days Difference: " + daysBetween);
        // System.out.println("Current Time: " + time);
        // System.out.println("Current Date and Time: " + dateTime);

        int last3Dig = 100;
        int randomPart = 100000 + RANDOM.nextInt(900000);
        System.out.println(randomPart);
        System.out.println(randomPart*1000 + last3Dig++);
        System.out.println(randomPart*1000 + last3Dig++);
        System.out.println(randomPart*1000 + last3Dig++);
        System.out.println(randomPart*1000 + last3Dig++);
        System.out.println(randomPart*1000 + last3Dig++);
    }
}
