package model.operations;

public class Subtraction implements MathOperation {
    private final int id = 2;

    @Override
    public double execute(double[] values) {
        return values[0] - values[1];
    }

    @Override
    public int getOperation() {
        return id;
    }

}
