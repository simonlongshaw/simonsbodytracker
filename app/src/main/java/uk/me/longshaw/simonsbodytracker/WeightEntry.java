package uk.me.longshaw.simonsbodytracker;

/**
 * Created by Simon on 9/25/2016.
 */

public interface WeightEntry {
    /** Add a weight entry */
    public void Add(double value, WeightValueType valueType);

    /** Add a weight entry */
    public void Add(String value, WeightValueType valueType);

    /** Get the value in kg*/
    public double GetKilograms();

    /** Get the original value*/
    public String GetOriginalValue();

    /** Get the original type*/
    public String GetOriginalType();
}
