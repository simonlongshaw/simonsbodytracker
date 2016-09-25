package uk.me.longshaw.simonsbodytracker;

/**
 * Created by Simon on 9/18/2016.
 */
public class Fraction {

    private int Numerator; // x
    private int Denominator; // y

    public int getNumerator() {
        return Numerator;
    }

    public void setNumerator(int Numerator) {
        this.Numerator = Numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public void setDenominator(int Denominator) {
        this.Denominator = Denominator;
    }

    // This method is used to display fractions
    // Some kind of processing also
    public String toString() {

        // 0/y and x/1 types
        if (Numerator == 0 || Denominator == 1) {
            return (Integer.toString(Numerator));
        }

        // -x/-y and x/-y types
        else {
            if ((Numerator < 0 && Denominator < 0) || (Numerator > 0 && Denominator < 0)) {
                Numerator *= -1;
                Denominator *= -1;
            }

            // x/x type
            if (Numerator == Denominator) {
                System.out.print(Numerator);
                return ("to do");
            }

            return(this.Numerator + "/" + this.Denominator);
        }

    }

}
