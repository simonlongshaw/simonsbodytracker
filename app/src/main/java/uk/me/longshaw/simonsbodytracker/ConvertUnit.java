package uk.me.longshaw.simonsbodytracker;

import android.support.annotation.FractionRes;
import android.support.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Simon on 9/17/2016.
 */

public abstract class ConvertUnit {

    @NonNull
    @Contract("null -> fail")
    public static Double kgToPound(Double kg) {
        if (kg == null) {
            throw new IllegalArgumentException();
        }

        if (Double.isNaN(kg)) {
            throw new IllegalArgumentException();
        }

        if (kg >= 400.0) {
            throw new IllegalArgumentException();
        }

        if (kg < 0) {
            throw new IllegalArgumentException();
        }

        return  kg * 2.2046;
    }

    @NonNull
    @Contract("null -> fail")
    public static Double poundToKg(Double pound) {

        if (pound == null) {
            throw new IllegalArgumentException();
        }

        if (Double.isNaN(pound)) {
            throw new IllegalArgumentException();
        }

        if (pound >= 880.0) {
            throw new IllegalArgumentException();
        }

        if (pound < 0) {
            throw new IllegalArgumentException();
        }

        return  pound / 2.2046;
    }

    @NonNull
    @Contract("null -> fail")
    public static Double stoneToPound(Double stone) {

        if (stone == null) {
            throw new IllegalArgumentException();
        }

        if (Double.isNaN(stone)) {
            throw new IllegalArgumentException();
        }

        if (stone >= 63.0) {
            throw new IllegalArgumentException();
        }

        if (stone < 0) {
            throw new IllegalArgumentException();
        }

        return  stone * 14.000;
    }

    @NonNull
    @Contract("null -> fail")
    public static Double poundToStone(Double pound) {
        if (pound == null) {
            throw new IllegalArgumentException();
        }

        if (Double.isNaN(pound)) {
            throw new IllegalArgumentException();
        }

        if (pound >= 880.0) {
            throw new IllegalArgumentException();
        }

        if (pound < 0) {
            throw new IllegalArgumentException();
        }

        return  pound / 14.000;
    }

    @NonNull
    @Contract("null -> fail")
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
        if (pounds >= 14.0) {
            throw new IllegalArgumentException();
        }

        double stone = Double.parseDouble(split[0]);

        if (stone >= 64.0) {
            throw new IllegalArgumentException();
        }

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
