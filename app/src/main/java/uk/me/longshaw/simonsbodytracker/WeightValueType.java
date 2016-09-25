package uk.me.longshaw.simonsbodytracker;

/**
 * Created by Simon on 9/25/2016.
 */

public enum WeightValueType {
    Kilograms("kg"),
    Pounds("lb"),
    Stones("st"),
    StonesAndPounds("st-lb");

    private final String abbreviation;

    WeightValueType(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation()
    {
        return abbreviation;
    }
}
