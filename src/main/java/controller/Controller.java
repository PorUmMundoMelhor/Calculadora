package controller;

import model.calculators.AreaCalculator;
import model.calculators.Calculator;
import model.calculators.IMCCalculator;
import model.calculators.NormalCalculator;
import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controller {
    private int calculatorMenuLimit = 3;
    double[] values = new double[2];
    private int calculatorMenuOption;
    private int areaCalculatorSelectedOption;
    private View view = new View();

    private final List<Calculator> calculators = new ArrayList<>() {{
        add(new NormalCalculator()); // id 1
        add(new IMCCalculator()); // id 2
        add(new AreaCalculator()); // id 3
    }};

    public void execute() {
        int finalize = 0;
        double result;
        do {
            view.introduction();
            view.calculatorOptions();
            calculatorMenuOption = readOption(calculatorMenuLimit);
            switch (calculatorMenuOption) {
                case 1 -> {
                    result = calculators.get(0).calculate(readOperation(), readValues());
                    view.resultValue(result);
                }
                case 2 -> {
                    result = calculators.get(1).calculate(1, readValuesImc());
                    view.resultValue(result);
                    view.imcResult(result);
                }
                case 3 -> {
                    result = calculators.get(2).calculate(readOperation(), readValuesArea());
                    view.resultValue(result);
                }
            }
            view.restartProgram();
            finalize = readOption(2);
        } while (finalize == 1);
        view.goodBye();
    }

    private int readOperation() {
        Scanner scanner = new Scanner(System.in);
        boolean finalize = false;
        int operation = 0;
        do {
            try {
                switch (calculatorMenuOption) {
                    case 1 -> {
                        view.normalCalculatorOptions();
                        operation = scanner.nextInt();
                        finalize = true;
                    }
                    case 3 -> {
                        view.areaCalculatorOptions();
                        areaCalculatorSelectedOption = scanner.nextInt();
                        finalize = true;
                    }
                }
            } catch (Exception e) {
                view.invalidValue();
            }
        } while (!finalize);
        return operation;
    }

    private double[] readValues() {
        Scanner scanner = new Scanner(System.in);
        boolean finalize = false;
        do {
            try {
                view.firstValue();
                values[0] = scanner.nextDouble();
                view.secondValue();
                values[1] = scanner.nextDouble();
                finalize = true;
            } catch (Exception e) {
                view.invalidValue();
            }
        } while (!finalize);
        return values;
    }

    private int readOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String optionMenu;
        int validation = 0;
        do {
            optionMenu = scanner.nextLine();
            try {
                validation = Integer.parseInt(optionMenu);
                if (validation <= 0 || validation > limit) {
                    view.youTyped(optionMenu);
                    view.invalidOption();
                }
            } catch (Exception e) {
                view.youTyped(optionMenu);
                view.invalidOption();
            }
        } while (validation <= 0 || validation > limit);
        return validation;
    }

    private double[] readValuesImc() {
        Scanner scanner = new Scanner(System.in);
        boolean finalize = false;
        do {
            try {
                view.enterYourWeight();
                values[0] = scanner.nextDouble();
                view.enterYourHeight();
                values[1] = scanner.nextDouble();
                finalize = true;
            } catch (Exception e) {
                view.invalidValue();
            }
        } while (!finalize);
        return values;
    }

    private double[] readValuesArea() {
        Scanner scanner = new Scanner(System.in);
        boolean finalize = false;
        do {
            try {
                switch (calculatorMenuOption) {
                    case 1 -> { // circle
                        view.radiusCircleArea();
                        values[0] = scanner.nextInt();
                        finalize = true;
                    }
                    case 2 -> { // square
                        view.heightLengthSquareArea();
                        values[0] = scanner.nextInt();
                        view.baseLengthSquareArea();
                        values[1] = scanner.nextInt();
                        finalize = true;
                    }
                    case 3 -> { // triangle
                        view.heightLengthTriangleArea();
                        values[0] = scanner.nextInt();
                        view.baseLengthTriangleArea();
                        values[1] = scanner.nextInt();
                        finalize = true;
                    }
                }
            } catch (Exception e) {
                view.invalidValue();
            }
        } while (!finalize);
        return values;
    }
}
