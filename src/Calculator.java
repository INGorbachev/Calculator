import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");

        String operator;

        if (scanner.hasNextInt()) {
            int arab1 = scanner.nextInt();
            operator = scanner.next();
            if (scanner.hasNextInt()) {
                int arab2 = scanner.nextInt();
                scanner.close();

                System.out.println("Output");

                if (((arab1 > 0 && arab1 <= 10) & (arab2 > 0 && arab2 <= 10))) {
                    switch (operator) {
                        case "+" -> System.out.println(Operations.plus(arab1, arab2));
                        case "-" -> System.out.println(Operations.minus(arab1, arab2));
                        case "*" -> System.out.println(Operations.multiply(arab1, arab2));
                        case "/" -> System.out.println(Operations.divide(arab1, arab2));
                        default -> throw new IllegalArgumentException("Invalid operator");
                    }
                } else throw new IllegalArgumentException("Invalid  1 number: Input (1-10)");
            } else throw new IllegalArgumentException("Invalid  2 number: Input (1-10)");

        } else {
            if (scanner.hasNext()) {
                String rome1 = scanner.next();
                operator = scanner.next();
                String rome2 = scanner.next();
                scanner.close();
                System.out.println("Output");

                switch (operator) {
                    case "+" -> Transform.transformDo10(Operations.plus(ConvertEnum.RomanNumeral.toInt(rome1), ConvertEnum.RomanNumeral.toInt(rome2)));
                    case "-" -> Transform.transformDo10(Operations.minus(ConvertEnum.RomanNumeral.toInt(rome1), ConvertEnum.RomanNumeral.toInt(rome2)));
                    case "*" -> Transform.transformDo10(Operations.multiply(ConvertEnum.RomanNumeral.toInt(rome1), ConvertEnum.RomanNumeral.toInt(rome2)));
                    case "/" -> Transform.transformDo10(Operations.divide(ConvertEnum.RomanNumeral.toInt(rome1), ConvertEnum.RomanNumeral.toInt(rome2)));
                    default -> throw new IllegalArgumentException("Invalid operator: Input (+-*/)");
                }
            }
        }
    }
}




