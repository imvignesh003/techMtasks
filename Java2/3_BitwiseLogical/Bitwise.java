public class Bitwise {
    private static boolean expensiveOperation() {

        System.out.println("Expensive operation executed!");

        return true;

    }
	public static void main(String[] args) {
		int a = 5, b = 0;
        if (b != 0 && (a / b) > 1) {
            System.out.println("Logical AND: This won't execute.");
        } else {
            System.out.println("Logical AND: No division by zero error.");
        }
        try {
            if (b != 0 & (a / b) > 1) {
                System.out.println("Bitwise AND: This won't execute.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Bitwise AND: Division by zero error!");
        }
        
        boolean result1 = true || expensiveOperation();
        System.out.println("Logical OR: Expensive operation skipped."+result1);
        boolean result2 = true | expensiveOperation();
        System.out.println("Bitwise OR: Expensive operation executed."+result2);
    }


}