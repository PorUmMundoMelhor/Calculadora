package model.calculators;

import model.operations.CircleArea;
import model.operations.MathOperation;
import model.operations.SquareArea;
import model.operations.TriangleArea;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator implements Calculator {

    public int id = 3;

    private final List<MathOperation> operations = new ArrayList() {{
        add(new CircleArea()); // id 1
        add(new SquareArea()); // id 2
        add(new TriangleArea()); // id 3
    }};

    @Override
    public double calculate(int operation, double[] values) {
        double result = operations.stream().filter(calc -> calc.getOperation() == operation).findAny().get().execute(values);
        return result;
    }

}
