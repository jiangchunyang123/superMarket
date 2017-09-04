/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapplication1.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *日期工具类
 * @author Administrator
 */
public class DateUtils {

    private static String defaultFormatStr = "yyyy-MM-dd";

    public static String date2Str(Date date) {
        return date2Str(date, defaultFormatStr);
    }

    public static String date2Str(Date date, String formatter) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatter);
        return sdf.format(date);
    }

    public static Date str2Date(String dateStr) {
        return str2Date(dateStr, defaultFormatStr);
    }

    public static Date str2Date(String str, String formatter) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatter);
        try {
            return sdf.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(DateUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
