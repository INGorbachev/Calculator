public class Transform {

    public static void transformDo10(int x) {
        String do10;
        if (Operations.result == 100) {
            System.out.println("C");
        } else if (Operations.result % 10 == 1) {
            do10 = "I";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 2) {
            do10 = "II";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 3) {
            do10 = "III";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 4) {
            do10 = "IV";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 5) {
            do10 = "V";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 6) {
            do10 = "VI";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 7) {
            do10 = "VII";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 8) {
            do10 = "VIII";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 9) {
            do10 = "IX";
            transformBolshe10(do10);
        } else if (Operations.result % 10 == 0) {
            do10 = "";
            transformBolshe10(do10);
        }

    }

    public static void transformBolshe10(String do10) {
        if (Operations.result / 10 % 10 == 0) {
            System.out.println(do10);
        } else if (Operations.result / 10 % 10 == 1) {
            System.out.println("X" + do10);
        } else if (Operations.result / 10 % 10 == 2) {
            System.out.println("XX" + do10);
        } else if (Operations.result / 10 % 10 == 3) {
            System.out.println("XXX" + do10);
        } else if (Operations.result / 10 % 10 == 4) {
            System.out.println("XL" + do10);
        } else if (Operations.result / 10 % 10 == 5) {
            System.out.println("L" + do10);
        } else if (Operations.result / 10 % 10 == 6) {
            System.out.println("LX" + do10);
        } else if (Operations.result / 10 % 10 == 7) {
            System.out.println("LXX" + do10);
        } else if (Operations.result / 10 % 10 == 8) {
            System.out.println("LXXX" + do10);
        } else if (Operations.result / 10 % 10 == 9) {
            System.out.println("XC" + do10);
        }
    }
}
