package model.operations;

public class TriangleArea implements MathOperation {

    private final int id = 3;

    @Override
    public double execute(double[] values) {
        double value = (values[0] * values[1]) / 2;
        return value;
    }

    @Override
    public int getOperation() {
        return id;
    }
}
