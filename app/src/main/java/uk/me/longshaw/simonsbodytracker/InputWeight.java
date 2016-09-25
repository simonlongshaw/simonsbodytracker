package uk.me.longshaw.simonsbodytracker;

/**
 * Created by Simon on 9/25/2016.
 */

public class InputWeight implements WeightEntry {

    @Override
    public void Add(double value, WeightValueType valueType) {
        valueType.getAbbreviation();
        throw new UnsupportedOperationException();
    }

    @Override
    public void Add(String value, WeightValueType valueType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double GetKilograms() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String GetOriginalValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String GetOriginalType() {
        throw new UnsupportedOperationException();
    }
}
