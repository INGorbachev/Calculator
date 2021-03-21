// Переводим результат вычисления Римских цифр из Арабской
public class Transform {
    public static void transformProst(int x) {
        String prost;
        if (Operations.result % 10 == 1) {
            prost = "I";
            transformDes(prost);
        } else if (Operations.result % 10 == 2) {
            prost = "II";
            transformDes(prost);
        } else if (Operations.result % 10 == 3) {
            prost = "III";
            transformDes(prost);
        } else if (Operations.result % 10 == 4) {
            prost = "IV";
            transformDes(prost);
        } else if (Operations.result % 10 == 5) {
            prost = "V";
            transformDes(prost);
        } else if (Operations.result % 10 == 6) {
            prost = "VI";
            transformDes(prost);
        } else if (Operations.result % 10 == 7) {
            prost = "VII";
            transformDes(prost);
        } else if (Operations.result % 10 == 8) {
            prost = "VIII";
            transformDes(prost);
        } else if (Operations.result % 10 == 9) {
            prost = "IX";
            transformDes(prost);
        } else if (Operations.result == 100)
            System.out.println("C");

    }

    public static void transformDes(String prost) {
        if (Operations.result / 10 % 10 == 1) {
            System.out.println("X" + prost);
        } else if (Operations.result / 10 % 10 == 2) {
            System.out.println("XX" + prost);
        } else if (Operations.result / 10 % 10 == 3) {
            System.out.println("XXX" + prost);
        } else if (Operations.result / 10 % 10 == 4) {
            System.out.println("XL" + prost);
        } else if (Operations.result / 10 % 10 == 5) {
            System.out.println("L" + prost);
        } else if (Operations.result / 10 % 10 == 6) {
            System.out.println("LX" + prost);
        } else if (Operations.result / 10 % 10 == 7) {
            System.out.println("LXX" + prost);
        } else if (Operations.result / 10 % 10 == 8) {
            System.out.println("LXXX" + prost);
        } else if (Operations.result / 10 % 10 == 9) {
            System.out.println("XC" + prost);
        }
    }
}
