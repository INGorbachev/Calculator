// Переводим Римские цифры в Арабские

public class ConvertEnum {

    enum RomanNumeral {
        I("I", 1),
        II("II", 2),
        III("III", 3),
        IV("IV", 4),
        V("V", 5),
        VI("VI", 6),
        VII("VII", 7),
        VIII("VIII", 8),
        IX("IX", 9),
        X("X", 10);

        private final String rome;
        private final int arab;

        RomanNumeral(String rome, int arab) {
            this.rome = rome;
            this.arab = arab;

        }

        public String getRome() {

            return rome;
        }

        public int getArab() {

            return arab;
        }

        static int toInt(String rome) {
            for (RomanNumeral i : RomanNumeral.values())
                if (i.getRome().equals(rome))
                    return i.getArab();
            throw new IllegalArgumentException("Invalid Roman number: Input (I-X)");
        }
    }
}
