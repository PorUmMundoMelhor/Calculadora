package model.calculators;

import model.operations.*;

import java.util.ArrayList;
import java.util.List;

public class NormalCalculator implements Calculator {

    public int id = 1;

    private final List<MathOperation> operations = new ArrayList() {{
        add(new Division());
        add(new Multiplication());
        add(new Potentiation());
        add(new Sum());
        add(new Subtraction());
    }};

    @Override
    public double calculate(int operation, double[] values) {
        double result = operations.stream().filter(calc -> calc.getOperation() == operation).findAny().get().execute(values);
        return result;
    }


}
