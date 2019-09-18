package calculator2;

public class CalcMetode {

    private double value;

    public CalcMetode add(double x) {
        value += x;
        return this;
    }

    public CalcMetode sub(double x) {
        value -= x;
        return this;
    }

    public CalcMetode mul(double x) {
        value *= x;
        return this;
    }

    public CalcMetode div(double x) {
        value /= x;
        return this;
    }

    public double value() {
        return value;
    }
}

