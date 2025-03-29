public class Operators {
	public static void main(String[] args) {
        int a=60;
        double b=25.5;
        boolean c=true;
        float f=55.5f;
        long l=400000L;
        byte bt=34;
        short sh=5000;
        System.out.println(" Arithmetic Operations:");
        System.out.println("Addition (int + double): " + (a + b));
        System.out.println("Multiplication (float * int): " + (f * a));
        System.out.println("Division (double / int): " + (b / a));
        System.out.println("Modulo (long % short): " + (l % sh));
        System.out.println("\n🔹 Comparison Operations:");
        System.out.println("Is int > short? " + (a > sh));
        System.out.println("Is byte == 34? " + (bt == 34));
        System.out.println("Is double<= float? " + (b <= f));
        System.out.println("\n🔹 Logical Operations:");
        System.out.println("bool AND (int > 5): " + (c && (a > 5)));
        System.out.println("bool OR (double < 10): " + (c || (b < 10)));
        System.out.println("NOT bool: " + (!c));
        System.out.println("\n🔹 Bitwise Operations:");

        int bitwiseA = 5;
        int bitwiseB = 3;

        System.out.println("5 & 3 (Bitwise AND): " + (bitwiseA & bitwiseB));
        System.out.println("5 | 3 (Bitwise OR): " + (bitwiseA | bitwiseB));
        System.out.println("5 ^ 3 (Bitwise XOR): " + (bitwiseA ^ bitwiseB));



        System.out.println("\n🔹 Ternary Operator:");
        String result = (a > 5) ? "int is greater than 5" : "int is not greater than 5";
        System.out.println(result);

    }

}