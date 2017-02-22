package sundeepk.github.com.sample;

import java.util.Date;

/**
 * Created by rajnkuma on 2/23/17.
 */

public class DateContainer {

    public static Date currentSelectedDate;

    public static Date getCurrentSelectedDate() {
        if (currentSelectedDate == null) {
            currentSelectedDate = new Date();
        }
        return currentSelectedDate;
    }

    public static void setCurrentSelectedDate(Date currentSelectedDate) {
        DateContainer.currentSelectedDate = currentSelectedDate;
    }


}
