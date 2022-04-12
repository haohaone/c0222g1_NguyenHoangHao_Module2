package _08_clean_code.practice;

public class RenameVariableName {
    private static final char ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION;
    static {
        ADDITION = '+';
        SUBTRACTION = '-';
        MULTIPLICATION = '*';
        DIVISION = '/';
    }

    public static int calculate(int firstOperand, int secondOperand, char operator){
        switch (operator){
            case 1:
                return firstOperand + secondOperand;
            case 2:
                return firstOperand - secondOperand;
            case 3:
                return firstOperand * secondOperand;
            case 4:
                if (secondOperand != 0){
                    return firstOperand / secondOperand;
                }else {
                    throw new RuntimeException("Can not divide by 0");
                }
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
