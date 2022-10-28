package model.operations;

public class IMC implements MathOperation {

    private final int id = 1;

    @Override
    public double execute(double[] values) {
        double value = values[0] / (Math.pow(values[1], 2));
        return value;
    }

    @Override
    public int getOperation() {
        return id;
    }
}
