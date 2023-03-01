package be.technifutur.decouverte.primitif;

public class Decouverte {
    public static void main(String[] args){
        // boolean
        testBoolean();

        // entier signé
        testByte();
        testShort();
        testInteger();
        testLong();

        // caractère
        testChar();

        // numérique flottant
        testFloat();
        testDouble();
    }

    private static void testDouble() {
        double test = 5.3;
        System.out.println("divison par 0 : " +(test/0));

        test = Long.MAX_VALUE;

        for (int i = 0; i < 200 ; i++) {
            test-= 100;
            long l = (long)test;
            System.out.printf("double : %s long : %s %n", test, 1);
        }
    }

    private static void testFloat() {
        float test = 5.3F;

    }


    private static void testChar(){
        char car = 'r';
        char car2 = 'a';
        int res = car + car2;
    }
    private static void testLong(){
        long test = Long.MAX_VALUE; // milliard de milliard
        test = 9_223_372_036_854_775_807L;
        int val = 5;
        test = test -val; //long - int => long - long
    }

    private static void testInteger() {
        int test = Integer.MIN_VALUE; // -2.000.000.000 à +2.000.000.000
        int test2 = 3; // 3 est un int

        test = test / test2; // DIV
        test = test % test2;

        test = 0b00110; // 6
        System.out.println("1. 0b00110 = "+test);
        System.out.println("2. test & test2 = " + (test & test2)); // 2
        System.out.println("3. test | test2 = " + (test | test2)); // 7
        System.out.println("4. test ^ test2 = " + (test ^ test2)); // 5
        System.out.println("5. ~test +1 = " + (~test +1));         // -6 (complément à 2 en binaire)

        System.out.println("6. test << 2 = " + (test << 2));       // 24
        System.out.println("7. test >> 2 = " + (test >> 2));       // 1
        System.out.println("8. test >>> 2 = " + (test >>> 2));       // 1

        test = -6;
        System.out.println("9. test << 2 = " + (test << 2));       // -24
        System.out.println("10. test >> 2 = " + (test >> 2));       // -2
        System.out.println("11. test >> 2 = " + (test >>> 2));       // 1.073.741.822

        System.out.println(Integer.toBinaryString(test));


    }

    private static void testShort() {
        short test = Short.MIN_VALUE; // -30.000 à +30.000
        short test2 = 2;
        int i = test2;
        // test = i;
        test = (short)i;
        test += test2; //test = (short)(test + test2);
    }

    private static void testByte() {
        byte test = Byte.MIN_VALUE; // -100 à +100
        byte test2 = 2;
        int i = test2;
        // test = i;
        test = (byte)i;
        test += test2; //test = (byte)(test + test2);
    }

    private static void testBoolean() {
        boolean test = true;
        boolean test2 = false;
        test = false;

        test = !test;           //not
        test = test & test2;    // et évaluation longue
        test = test && test2;   // et évaluaton courte
        test = test | test2;    // ou évalution longue
        test = test || test2;   // évalutation courte
        test = test ^ test2;    // xor

        test &= test2;          // -> test = test & test2;
        test |= test2;          // -> test = test | test2;
        test ^= test2;          // -> test = test ^ test2;

        Boolean object = Boolean.TRUE;
        test = object; // auto unboxing
        test = object.booleanValue(); // unboxing
        object = test; // auto boxing
        object = Boolean.valueOf(test);

        if (test == false){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        test2 = test = (5+4 > 7);

    }


}
