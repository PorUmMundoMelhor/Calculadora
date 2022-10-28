package model.operations;

public class Potentiation implements MathOperation {

    private final int id = 5;

    @Override
    public double execute(double[] values) {
        return Math.pow(values[0], values[1]);
    }

    @Override
    public int getOperation() {
        return id;
    }
}
