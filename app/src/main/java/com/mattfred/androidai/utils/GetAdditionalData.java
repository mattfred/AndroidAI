package com.mattfred.androidai.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class GetAdditionalData {

    public static String getDate() {
        String response = "Today is ";
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case Calendar.SUNDAY:
                response += "Sunday, ";
                break;
            case Calendar.MONDAY:
                response += "Monday, ";
                break;
            case Calendar.TUESDAY:
                response += "Tuesday, ";
                break;
            case Calendar.WEDNESDAY:
                response += "Wednesday, ";
                break;
            case Calendar.THURSDAY:
                response += "Thursday, ";
                break;
            case Calendar.FRIDAY:
                response += "Friday, ";
                break;
            case Calendar.SATURDAY:
                response += "Saturday, ";
                break;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM/dd/yyyy", Locale.getDefault());
        response += dateFormat.format(new Date());
        return response;
    }
}
