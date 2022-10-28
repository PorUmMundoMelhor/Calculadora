package view;

public class View {

    public void introduction() {
        System.out.println("************************************************************");
        System.out.println("***************** BEM VINDO AO PROGRAMA DE CALCULO *********");
        System.out.println("************************************************************");
    }


    public void calculatorOptions() {
        System.out.println("\n*****   Opções de Calculadoras:  *****");
        System.out.println("*****  1 - Calculadora Padrão      *****");
        System.out.println("*****  2 - Calculadora de IMC      *****");
        System.out.println("*****  3 - Calculadora de Área     *****");
        System.out.println("Digite um numero equivalente a sua escolha: ");
    }

    public void areaCalculatorOptions() {
        System.out.println("\n********** OPÇÕES DA DE AREA     **********");
        System.out.println("**********  1 - Area do Circulo    **********");
        System.out.println("**********  2 - Area do Quadrado   **********");
        System.out.println("**********  3 - Area do Retangulo  **********");
        System.out.println("Digite um numero equivalente a sua escolha: ");
    }

    public void normalCalculatorOptions() {
        System.out.println("\n********** OPÇÕES CALCULADORA PADRAO **********");
        System.out.println("**********  1 - SOMA                   **********");
        System.out.println("**********  2 - SUBTRAÇÃO              **********");
        System.out.println("**********  3 - MULTIPLICACÃO          **********");
        System.out.println("**********  4 - DIVISAO                **********");
        System.out.println("**********  5 - POTENCIAÇÃO            **********");
        System.out.println("Digite um numero equivalente a sua escolha: ");
    }

    public void resultValue(Object result) {
        System.out.println("Resultado da operação: " + result);
    }

    public void goodBye() {
        System.out.println("Fim do programa, até a próxima !!");
    }

    public void firstValue() {
        System.out.println("Insira o primeiro valor: ");
    }

    public void secondValue() {
        System.out.println("Insira o segundo valor: ");
    }

    public void youTyped(String menuOption) {
        System.out.printf("Você Digitou %s. \n", menuOption);
    }

    public void invalidValue() {
        System.out.println("Valor invalido, digite novamente!");
    }

    public void invalidOption() {
        System.out.print("Opção invalida, digite uma opção valida: ");
    }

    public void restartProgram() {
        System.out.println("Deseja utilizar o programa novamente ?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÂO");
    }

    public void enterYourWeight() {
        System.out.print("Digite seu peso em kg: ");
    }

    public void enterYourHeight() {
        System.out.print("Digite sua altura em metros: ");
    }

    public void radiusCircleArea() {
        System.out.println("Utilize ponto para separar o inteiro das casas decimais!!");
        System.out.println("Digite o raio do circulo: ");
    }

    public void heightLengthSquareArea() {
        System.out.println("Utilize ponto para separar o inteiro das casas decimais!!");
        System.out.println("Digite a altura: ");
    }

    public void baseLengthSquareArea() {
        System.out.println("Utilize ponto para separar o inteiro das casas decimais!!");
        System.out.println("Digite a base: ");
    }

    public void heightLengthTriangleArea() {
        System.out.println("Utilize ponto para separar o inteiro das casas decimais!!");
        System.out.println("Digite a altura: ");
    }

    public void baseLengthTriangleArea() {
        System.out.println("Utilize ponto para separar o inteiro das casas decimais!!");
        System.out.println("Digite a base: ");
    }

    public void imcResult(double result) {
        if (result <= 18) {
            System.out.println("Abaixo do Peso Ideal");
        } else if (result <= 25) {
            System.out.println("Na média");
        } else if (result <= 30) {
            System.out.println("Sobrepeso");
        } else if (result > 30) {
            System.out.println("Obesidade");
        }
    }

}