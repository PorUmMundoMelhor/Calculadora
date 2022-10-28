package model.operations;

public class SquareArea implements MathOperation {

    private final int id = 2;

    @Override
    public double execute(double[] values) {
        double value = values[0] * values[1];
        return value;
    }

    @Override
    public int getOperation() {
        return id;
    }
}
