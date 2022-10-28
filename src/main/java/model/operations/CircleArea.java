package model.operations;

public class CircleArea implements MathOperation {

    private final int id = 1;

    @Override
    public double execute(double[] values) {
        double value = Math.PI * Math.pow(values[0], 2);
        return value;
    }

    public int getOperation() {
        return id;
    }
}

