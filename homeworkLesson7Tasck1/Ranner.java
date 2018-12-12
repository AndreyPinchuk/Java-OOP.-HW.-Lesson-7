package homeworkLesson7Tasck1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Ranner {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jon", "Rafeal", "Leonardo", "Zog");
        String longestName = Max.max(names, new LengthComparator());
        System.out.println(longestName);

        List<LocalDate> birthDays = Arrays.asList(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1986, 3, 15),
                LocalDate.of(1990, 10, 3),
                LocalDate.of(1990, 2, 26)
        );
        LocalDate latestBirthDayInYear = Max.max(birthDays, new DayInYearComparator());
        System.out.println(latestBirthDayInYear);
    }
}
/*Leonardo
1990-10-03

Process finished with exit code 0*/