public class Calculator implements CalculatorInterface {
    int result = 0;
    @Override
    public int addition(int number1, int number2) {
      result = number1 + number2;
      return  result;
    }

    @Override
    public int substraction(int number1, int number2) {
        result = number1 - number2;
        return result;
    }

    @Override
    public int Division(int number1, int number2) {
        result = number1 / number2;
        return result;
    }

    @Override
    public int multiplication(int number1, int number2) {
       result = number1 * number2;
       return result;
    }

    @Override
    public int mode(int number1, int number2) {
        result = number1 % number2;
        return result;
    }
}
