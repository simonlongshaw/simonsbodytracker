package uk.me.longshaw.simonsbodytracker;

import android.support.annotation.FractionRes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Simon on 9/17/2016.
 */

public class ConvertUnit {

    public static Double kgToPound(Double kg) {
        return  kg * 2.2046;
    }

    public static Double poundToKg(Double pound) {
        return  pound / 2.2046;
    }

    public static Double stoneToPound(Double Stone) {
        return  Stone * 14.000;
    }

    public static Double poundToStone(Double Pound) {
        return  Pound / 14.000;
    }

    public static Double StonesAndPoundsToPounds(String stonesAndPounds)
    {
        Pattern p = Pattern.compile("[0-9]* [0-9]*\\.?[0-9]+");
        Matcher m = p.matcher(stonesAndPounds);
        boolean b = m.matches();
        if (b == false)
        {
            throw new IllegalArgumentException();
        }
        String[] split =  stonesAndPounds.split(" ");

        double pounds = Double.parseDouble(split[1]);
        double stone = Double.parseDouble(split[0]);
        pounds = pounds + stoneToPound(stone);
        return pounds;
    }

    public static String printPound(Double kg) {
        return (String.format("%.1f", ConvertUnit.kgToPound(kg)) + " lb");
    }

    public static String printStone(Double kg) {
        Double totalPounds = ConvertUnit.kgToPound(kg);
        Double stonewithreminder = totalPounds * 0.071429;
        int stone = stonewithreminder.intValue();
        Double  reminder = stonewithreminder - stone;
        Double pounds = reminder / 0.071429;

        return (Integer.toString(stone) + " st " +  String.format("%.1f",pounds) + " lb");
    }

    public static Double cmToInchDec(Double cm) {
        return  cm * 0.3937007874;
    }
    //http://www.metric-conversions.org/weight/pounds-to-stones.htm
}
