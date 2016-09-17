package uk.me.longshaw.simonsbodytracker;

/**
 * Created by Simon on 9/17/2016.
 */

public class ConvertUnit {

    public static Double pound(Double kg) {
        return  kg * 2.2046;
    }


    public static String printPound(Double kg) {
        return (String.format("%.2f", ConvertUnit.pound(kg)) + " lb");
    }

    public static String printStone(Double kg) {
        Double totalPounds = ConvertUnit.pound(kg);
        Double stonewithreminder = totalPounds * 0.071429;
        int stone = stonewithreminder.intValue();
        Double  reminder = stonewithreminder - stone;
        Double pounds = reminder / 0.071429;

        return (Integer.toString(stone) + " st " +  String.format("%.0f",pounds) + " lb");
    }
    //http://www.metric-conversions.org/weight/pounds-to-stones.htm
}
