package model.calculators;

import model.operations.IMC;
import model.operations.MathOperation;

public class IMCCalculator implements Calculator {

    MathOperation operations = new IMC();
    public int id = 2;

    @Override
    public double calculate(int operation, double[] values) {
        return operations.execute(values);
    }


}
